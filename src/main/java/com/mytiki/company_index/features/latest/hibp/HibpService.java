package com.mytiki.company_index.features.latest.hibp;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HibpService {
    private static final String IS_FABRICATED = "isFabricated";
    private static final String IS_RETIRED = "isRetired";
    private static final String IS_SPAM_LIST = "isSpamList";
    private static final String IS_VERIFIED = "isVerified";
    private static final String IS_SENSITIVE = "isSensitive";

    private final RestTemplate restTemplate;
    private final HibpRepository hibpRepository;

    public HibpService(RestTemplate restTemplate, HibpRepository hibpRepository) {
        this.restTemplate = restTemplate;
        this.hibpRepository = hibpRepository;
    }

    @Scheduled(fixedDelay = 1000*60*60) //1hrs
    public void index(){
        ZonedDateTime now = ZonedDateTime.now(ZoneOffset.UTC);
        Optional<HibpDO> latest = hibpRepository.findFirstByOrderByCachedOnDesc();
        if(latest.isEmpty() || latest.get().getCachedOn().isBefore(now.minusDays(1))) {
            ResponseEntity<List<HibpAO>> rsp = restTemplate.exchange(
                    "/breaches",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<HibpAO>>() {});
            if (rsp.getStatusCode().is2xxSuccessful() && rsp.getBody() != null) {
                List<HibpDO> doList = rsp.getBody().stream()
                        .filter(hibpAO -> (hibpAO.getName() != null && hibpAO.getDomain() != null))
                        .map(hibpAO -> map(hibpAO, now))
                        .collect(Collectors.toList());
                hibpRepository.saveAll(doList);
            }
        }
    }

    private List<String> createTypeList(HibpAO hibpAO){
        List<String> typeList = new ArrayList<>();
        if(hibpAO.getIsFabricated()) typeList.add(IS_FABRICATED);
        if(hibpAO.getIsRetired()) typeList.add(IS_RETIRED);
        if(hibpAO.getIsSpamList()) typeList.add(IS_SPAM_LIST);
        if(hibpAO.getIsVerified()) typeList.add(IS_VERIFIED);
        if(hibpAO.getIsSensitive()) typeList.add(IS_SENSITIVE);
        return typeList;
    }

    private HibpDO map(HibpAO hibpAO, ZonedDateTime cachedOn){
        HibpDO hibpDO = new HibpDO();
        hibpDO.setName(hibpAO.getName());
        hibpDO.setDomain(hibpAO.getDomain());
        hibpDO.setBreachedOn(ZonedDateTime.of(hibpAO.getBreachDate(),
                LocalTime.MIDNIGHT, ZoneOffset.UTC));
        hibpDO.setCachedOn(cachedOn);

        hibpDO.setPwnCount(hibpAO.getPwnCount());
        hibpDO.setPwnScore(calcScoreFromCount(hibpDO.getPwnCount()));

        hibpDO.setClasses(hibpAO.getDataClasses());
        hibpDO.setClassScore(calcScoreFromList(hibpDO.getClasses()));

        hibpDO.setTypes(createTypeList(hibpAO));
        hibpDO.setTypeScore(calcScoreFromList(hibpDO.getTypes()));

        hibpDO.setComboScore(calcCombo(
                hibpDO.getClassScore(),
                hibpDO.getPwnScore(),
                hibpDO.getTypeScore()));
        return hibpDO;
    }

    private BigDecimal calcScoreFromCount(int count){
        BigDecimal score = BigDecimal.valueOf(1);

        if(count > (int) HibpWeight.COUNT_100M.getLookup())
            score = score.add(BigDecimal.valueOf(HibpWeight.COUNT_100M.getWeight()));

        else if (count > (int) HibpWeight.COUNT_25M.getLookup())
            score = score.add(BigDecimal.valueOf(HibpWeight.COUNT_25M.getWeight()));

        else if (count > (int) HibpWeight.COUNT_10M.getLookup())
            score = score.add(BigDecimal.valueOf(HibpWeight.COUNT_10M.getWeight()));

        else if (count > (int) HibpWeight.COUNT_1M.getLookup())
            score = score.add(BigDecimal.valueOf(HibpWeight.COUNT_1M.getWeight()));

        return score.setScale(5, RoundingMode.HALF_UP);
    }

    private BigDecimal calcScoreFromList(List<String> list){
        BigDecimal score = BigDecimal.valueOf(1);
        for(String s : list){
            HibpWeight weight = HibpWeight.forLookup(s);
            if(weight != null) score = score.add(BigDecimal.valueOf(weight.getWeight()));
        }
        return score.setScale(5, RoundingMode.HALF_UP);
    }

    private BigDecimal calcCombo(BigDecimal classScore, BigDecimal pwnScore, BigDecimal typeScore){
        BigDecimal cap = BigDecimal.valueOf(150);
        BigDecimal score = classScore.multiply(pwnScore).multiply(typeScore);
        if(score.compareTo(cap) > 0 ) score = cap;
        return score.divide(cap, 5, RoundingMode.HALF_UP);
    }
}

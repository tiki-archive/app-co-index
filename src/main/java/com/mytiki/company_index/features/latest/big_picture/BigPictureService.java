package com.mytiki.company_index.features.latest.big_picture;

import com.mytiki.company_index.features.latest.company.CompanyService;
import com.mytiki.company_index.features.latest.flagged.FlaggedService;
import io.sentry.Sentry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

public class BigPictureService {
    private static final String WEBHOOK_URL = "https://company-index.mytiki.com/api/latest/big-picture";
    private final RestTemplate restTemplate;
    private final CompanyService companyService;
    private final FlaggedService flaggedService;

    public BigPictureService(RestTemplate restTemplate, CompanyService companyService,
                             FlaggedService flaggedService) {
        this.restTemplate = restTemplate;
        this.companyService = companyService;
        this.flaggedService = flaggedService;
    }

    public BigPictureAO find(String domain) throws BigPictureException{
        try {
            ResponseEntity<BigPictureAO> rsp = restTemplate
                    .getForEntity("/find?domain={domain}", BigPictureAO.class, domain);
            if (rsp.getStatusCode().equals(HttpStatus.OK)) {
                checkFlag(Objects.requireNonNull(rsp.getBody()));
                return rsp.getBody();
            }else {
                restTemplate.getForEntity("/find?domain={domain}&webhookUrl=" + WEBHOOK_URL,
                        BigPictureAO.class, domain);
                throw new HttpClientErrorException(HttpStatus.ACCEPTED);
            }
        } catch (HttpClientErrorException ex){
            if(ex.getStatusCode().equals(HttpStatus.NOT_FOUND))
                flaggedService.save("BigPicture", domain, "Not Found");
            throw new BigPictureException(domain, ex.getStatusCode());
        } catch (Exception e){
            Sentry.captureException(e);
            throw new BigPictureException(domain, e);
        }
    }

    public void update(BigPictureAOReqWebhook req) {
        if (req.getStatus().equals(200))
            companyService.update(req.getBody());
    }

    private void checkFlag(BigPictureAO bigPictureAO){
        if(bigPictureAO.getTags() == null || bigPictureAO.getTags().size() == 0)
            flaggedService.save("BigPicture", bigPictureAO.getDomain(), "No Tags");
        else if(bigPictureAO.getCategory() == null || bigPictureAO.getCategory().getSector() == null)
            flaggedService.save("BigPicture", bigPictureAO.getDomain(), "No Sector");
        else if(bigPictureAO.getCategory().getIndustry() == null)
            flaggedService.save("BigPicture", bigPictureAO.getDomain(), "No Industry");
    }

    private BigDecimal calcTagScore(List<String> tags){
        BigDecimal score = BigDecimal.valueOf(1);
        for(String s : tags){
            BigPictureWeight weight = BigPictureWeight.forLookup(s);
            if(weight != null && BigDecimal.valueOf(weight.getWeight()).compareTo(score) > 0)
                score = BigDecimal.valueOf(weight.getWeight());
        }
        return score.setScale(5, RoundingMode.HALF_UP);
    }

    private BigDecimal calcCategoryScore(String sector, String industry, String subIndustry){
        BigDecimal score = BigDecimal.valueOf(1);
        BigPictureWeight subIndustryWeight = BigPictureWeight.forLookup(subIndustry);
        BigPictureWeight industryWeight = BigPictureWeight.forLookup(industry);
        BigPictureWeight sectorWeight = BigPictureWeight.forLookup(sector);

        if(subIndustryWeight != null) score = BigDecimal.valueOf(subIndustryWeight.getWeight());
        else if(industryWeight != null) score = BigDecimal.valueOf(industryWeight.getWeight());
        else if(sectorWeight != null) score = BigDecimal.valueOf(sectorWeight.getWeight());

        return score.setScale(5, RoundingMode.HALF_UP);
    }

    public BigDecimal calcScore(String sector, String industry, String subIndustry, List<String> tags){
        BigDecimal tagScore = calcTagScore(tags);
        BigDecimal categoryScore = calcCategoryScore(sector, industry, subIndustry);
        BigDecimal highest = tagScore.compareTo(categoryScore) > 0 ? tagScore : categoryScore;
        return highest.divide(BigDecimal.valueOf(10), 5, RoundingMode.HALF_UP);
    }
}

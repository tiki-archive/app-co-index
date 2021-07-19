package com.mytiki.company_index.features.latest.big_picture;

import com.mytiki.company_index.features.latest.company.CompanyService;
import com.mytiki.company_index.features.latest.flagged.FlaggedService;
import io.sentry.Sentry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

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
}

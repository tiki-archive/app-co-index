package com.mytiki.company_index.features.latest.big_picture;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class BigPictureService {

    private final RestTemplate restTemplate;

    public BigPictureService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public BigPictureAO find(String domain){
        ResponseEntity<BigPictureAO> rsp = restTemplate.getForEntity("/find?domain={domain}", BigPictureAO.class, domain);
        if(rsp.getStatusCode().equals(HttpStatus.OK))
            return rsp.getBody();
        else return null;
    }

    //TODO need to implement controller for callback
    //TODO need to handle 200, 202 (callback), 404, 5xx
}

package com.mytiki.company_index.features.latest.hibp;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class HibpService {

    private final RestTemplate restTemplate;

    public HibpService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    //put on timer
    //check DB, if expired
    //index all
    //fetch all breaches
    //update all

    //setScale(5, RoundingMode.HALF_UP))

    public void index(){
        // get breach date
        ResponseEntity<List<HibpAO>> rsp = restTemplate.exchange(
                "breaches",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<HibpAO>>() {});
        if(rsp.getStatusCode().is2xxSuccessful()){
            //if success -> iterate over company update
        }
    }
}

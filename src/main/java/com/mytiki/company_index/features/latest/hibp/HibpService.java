package com.mytiki.company_index.features.latest.hibp;

import org.springframework.web.client.RestTemplate;

public class HibpService {

    private final RestTemplate restTemplate;

    public HibpService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}

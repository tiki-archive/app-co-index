package com.mytiki.company_index.features.latest.hibp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

public class HibpConfig {

    @Bean
    public HibpService hibpService(@Autowired RestTemplateBuilder restTemplateBuilder){
        return new HibpService(
                restTemplateBuilder
                        .rootUri("")
                        .defaultHeader("hibp-api-key", "")
                        .build()
        );
    }
}

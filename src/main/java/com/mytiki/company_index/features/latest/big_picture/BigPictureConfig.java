package com.mytiki.company_index.features.latest.big_picture;

import com.mytiki.company_index.config.ConfigProperties;
import com.mytiki.company_index.features.latest.hibp.HibpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

public class BigPictureConfig {
    public static final String ROOT_URI = "https://company.bigpicture.io/v1/companies/";

    @Bean
    public BigPictureService bigPictureService(
            @Autowired ConfigProperties configProperties,
            @Autowired RestTemplateBuilder restTemplateBuilder,
            @Autowired HibpRepository hibpRepository){
        return new BigPictureService(
                restTemplateBuilder
                        .rootUri(ROOT_URI)
                        .defaultHeader("Authorization", configProperties.getApiKeyBigPicture())
                        .build());
    }
}

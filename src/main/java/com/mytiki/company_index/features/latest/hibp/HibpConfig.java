package com.mytiki.company_index.features.latest.hibp;

import com.mytiki.company_index.config.ConfigProperties;
import com.mytiki.company_index.features.latest.flagged.FlaggedService;
import com.mytiki.company_index.utilities.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(HibpConfig.PACKAGE_PATH)
@EntityScan(HibpConfig.PACKAGE_PATH)
public class HibpConfig {
    public static final String PACKAGE_PATH = Constants.PACKAGE_FEATURES_LATEST_DOT_PATH + ".hibp";
    public static final String ROOT_URI = "https://haveibeenpwned.com/api/v3/";

    @Bean
    public HibpService hibpService(
            @Autowired ConfigProperties configProperties,
            @Autowired RestTemplateBuilder restTemplateBuilder,
            @Autowired HibpRepository hibpRepository,
            @Autowired FlaggedService flaggedService){
        return new HibpService(
                restTemplateBuilder
                        .rootUri(ROOT_URI)
                        .defaultHeader("hibp-api-key", configProperties.getApiKeyHibp())
                        .defaultHeader("user-agent", "TIKI")
                        .build(),
                hibpRepository,
                flaggedService
        );
    }
}

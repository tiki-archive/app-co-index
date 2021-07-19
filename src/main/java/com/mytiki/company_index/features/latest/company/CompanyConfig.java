package com.mytiki.company_index.features.latest.company;

import com.mytiki.company_index.features.latest.big_picture.BigPictureService;
import com.mytiki.company_index.features.latest.hibp.HibpService;
import com.mytiki.company_index.utilities.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(CompanyConfig.PACKAGE_PATH)
@EntityScan(CompanyConfig.PACKAGE_PATH)
public class CompanyConfig {
    public static final String PACKAGE_PATH = Constants.PACKAGE_FEATURES_LATEST_DOT_PATH + ".company";

    @Bean
    public CompanyController companyController(@Autowired CompanyService companyService){
        return new CompanyController(companyService);
    }

    @Bean
    public CompanyService companyService(
            @Autowired CompanyRepository companyRepository,
            @Autowired BigPictureService bigPictureService,
            @Autowired HibpService hibpService){
        return new CompanyService(companyRepository, bigPictureService, hibpService);
    }
}

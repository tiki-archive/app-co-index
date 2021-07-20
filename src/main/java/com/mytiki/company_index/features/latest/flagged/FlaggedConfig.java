package com.mytiki.company_index.features.latest.flagged;

import com.mytiki.company_index.utilities.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(FlaggedConfig.PACKAGE_PATH)
@EntityScan(FlaggedConfig.PACKAGE_PATH)
public class FlaggedConfig {
    public static final String PACKAGE_PATH = Constants.PACKAGE_FEATURES_LATEST_DOT_PATH + ".flagged";

    @Bean
    public FlaggedService flaggedService(@Autowired FlaggedRepository flaggedRepository){
        return new FlaggedService(flaggedRepository);
    }
}

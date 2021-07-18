/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.company_index;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({
        CompanyIndexConfig.class
})
@SpringBootApplication
public class CompanyIndexApp {

    public static void main(final String... args) {
        SpringApplication.run(CompanyIndexApp.class, args);
    }
}
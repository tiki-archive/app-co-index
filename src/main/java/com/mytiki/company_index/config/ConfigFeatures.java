/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.company_index.config;


import com.mytiki.company_index.features.latest.hibp.HibpConfig;
import org.springframework.context.annotation.Import;

@Import({
        HibpConfig.class
})
public class ConfigFeatures {}

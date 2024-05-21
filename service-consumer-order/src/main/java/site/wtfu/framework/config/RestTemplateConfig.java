package site.wtfu.framework.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright 2021 wtfu.site Inc. All Rights Reserved.
 *
 * @author: 12302
 * @date: 2021-05-02
 */

@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplateWithRibbon() {
        return new RestTemplate();
    }


    @Bean
    public RestTemplate origin(){
        return new RestTemplate();
    }
}

package site.wtfu.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * Copyright wtfu.site Inc. All Rights Reserved.
 *
 * @date 2024/5/16
 *                          @since  1.0
 *                          @author 12302
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SPUApplication {

    public static void main(String[] args) {
        SpringApplication.run(SPUApplication.class,args);
    }

}

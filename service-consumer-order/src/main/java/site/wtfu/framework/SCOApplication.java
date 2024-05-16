package site.wtfu.framework;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
@EnableDubbo
public class SCOApplication {

    public static void main(String[] args) {
        SpringApplication.run(SCOApplication.class,args);
    }

}

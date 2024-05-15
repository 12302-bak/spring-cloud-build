package site.wtfu.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

/**
 *
 * Copyright wtfu.site Inc. All Rights Reserved.
 *
 * @date 2024/5/16
 *                          @since  1.0
 *                          @author 12302
 *
 */
@RestController
public class TestConsumerController {

    @Autowired
    public RestTemplate restTemplate;

    @RequestMapping(value = "test")
    public Object test(){
        return restTemplate.getForObject("http://service-provider-user-name/getUserInfo/" + 10, ArrayList.class);
    }
}

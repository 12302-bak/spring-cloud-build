package site.wtfu.framework.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
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

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource(name = "origin")
    private RestTemplate origin;

    /**
     * 1). 直接使用端口域名访问（Client发现，取值，访问）
     * @return
     */
    @RequestMapping(value = "direct")
    public Object testDirect(){
        ServiceInstance serviceInstance = discoveryClient.getInstances("SERVICE-PROVIDER-USER-NAME").get(0);
        return origin.getForObject("http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/getUserInfo/" + 10, ArrayList.class);
    }



    @Resource(name = "restTemplateWithRibbon")
    private RestTemplate restTemplateWithRibbon;

    /**
     * 2). 使用ribbon自动处理，并且实现负载均衡的效果
     * @return
     */
    @RequestMapping(value = "ribbon")
    public Object testServiceName(){
        return restTemplateWithRibbon.getForObject("http://service-provider-user-name/getUserInfo/" + 10, ArrayList.class);
    }
}

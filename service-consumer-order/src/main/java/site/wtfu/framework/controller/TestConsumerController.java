package site.wtfu.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import site.wtfu.framework.beans.User;
import site.wtfu.framework.service.IUserService;

import java.util.ArrayList;
import java.util.List;

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
    private IUserService userService;

    @RequestMapping(value = "test")
    public Object test(){
        return userService.getUsers(10);
    }
}

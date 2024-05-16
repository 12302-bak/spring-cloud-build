package site.wtfu.framework.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.wtfu.framework.service.IUserService;

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

    @Reference
    public IUserService iUserService;

    @RequestMapping(value = "test")
    public Object test(){
        return iUserService.getUsers(10);
    }
}

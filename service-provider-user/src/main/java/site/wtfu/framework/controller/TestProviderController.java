package site.wtfu.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
public class TestProviderController {

    @Autowired
    public IUserService iUserService;

    @GetMapping("/getUserInfo/{psnId}")
    public Object getUserInfo() {
        return iUserService.getUsers(1);
    }

}

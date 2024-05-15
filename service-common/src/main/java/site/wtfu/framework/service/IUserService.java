package site.wtfu.framework.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import site.wtfu.framework.beans.User;

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
@FeignClient(name = "service-provider-user-name")
public interface IUserService {

    @GetMapping("/getUserInfo/{psnId}")
    List<User> getUsers(@PathVariable(name = "psnId") Integer director);

}

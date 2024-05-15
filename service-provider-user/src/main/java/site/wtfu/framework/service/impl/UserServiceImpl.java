package site.wtfu.framework.service.impl;

import org.springframework.stereotype.Service;
import site.wtfu.framework.beans.User;
import site.wtfu.framework.service.IUserService;

import java.util.Arrays;
import java.util.Date;
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
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public List<User> getUsers(Integer director) {

        return Arrays.asList(new User(1,"eli","xhsgg123",3,new Date()),
                new User(2,"wtfu","123@qq.com",3,new Date()));
    }

}

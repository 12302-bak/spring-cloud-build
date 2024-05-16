package site.wtfu.framework.service;

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
public interface IUserService {

    List<User> getUsers(Integer director);

}

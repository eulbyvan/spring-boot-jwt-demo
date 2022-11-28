package com.eulbyvan.springbootjwtdemo.service;

import com.eulbyvan.springbootjwtdemo.model.Role;
import com.eulbyvan.springbootjwtdemo.model.User;

import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

public interface IUserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}

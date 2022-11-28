package com.eulbyvan.springbootjwtdemo.repo;

import com.eulbyvan.springbootjwtdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

public interface IUserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

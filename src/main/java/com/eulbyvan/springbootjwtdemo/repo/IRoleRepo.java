package com.eulbyvan.springbootjwtdemo.repo;

import com.eulbyvan.springbootjwtdemo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

public interface IRoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

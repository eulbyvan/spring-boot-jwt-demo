package com.eulbyvan.springbootjwtdemo.service;

import com.eulbyvan.springbootjwtdemo.model.Role;
import com.eulbyvan.springbootjwtdemo.model.User;
import com.eulbyvan.springbootjwtdemo.repo.IRoleRepo;
import com.eulbyvan.springbootjwtdemo.repo.IUserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 29/11/22
 */

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserService implements IUserService {
	private final IUserRepo userRepo;
	private final IRoleRepo roleRepo;

	@Override
	public User saveUser(User user) {
		log.info("saving new user {} to the database", user.getName());
		return userRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {
		log.info("saving new role {} to the database: ", role.getName());
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		log.info("adding role {} to user {}", roleName, username);
		User user = userRepo.findByUsername(username);
		Role role = roleRepo.findByName(roleName);

		user.getRoles().add(role);
	}

	@Override
	public User getUser(String username) {
		log.info("fetching user {}", username);
		return userRepo.findByUsername(username);
	}

	@Override
	public List<User> getUsers() {
		log.info("fetching all the users");
		return userRepo.findAll();
	}
}

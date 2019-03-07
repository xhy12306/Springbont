package com.xhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xhy.pojo.User;
import com.xhy.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/findAll")
	public List<User> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "/insertUser", method = RequestMethod.POST)
	public boolean insertUser(User user) {
		return userService.insertUser(user);
	}

	@RequestMapping(value = "/deleteUser")
	public boolean deleteUser(Integer id) {
		return userService.deleteUser(id);
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public boolean updateUser(User user) {
		return userService.updateUser(user);
	}

	@RequestMapping(value = "/findByPage/{size}/{page}")
	public List<User> findByPage(@PathVariable Integer size, @PathVariable Integer page) {
		return userService.findByPage(size, page);
	}
}

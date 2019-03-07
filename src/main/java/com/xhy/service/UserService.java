package com.xhy.service;

import java.util.List;

import com.xhy.pojo.User;

public interface UserService {

	public List<User> findAll();

	public boolean insertUser(User user);

	public boolean deleteUser(Integer id);

	public boolean updateUser(User user);

	public List<User> findByPage(Integer size, Integer page);
}

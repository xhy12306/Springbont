package com.xhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhy.dao.UserDao;
import com.xhy.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public boolean insertUser(User user) {
		boolean b = userDao.insertUser(user);
		System.out.println(b);
		return b;
	}

	@Override
	public boolean deleteUser(Integer id) {
		boolean b = userDao.deleteUser(id);
		return b;
	}

	@Override
	public boolean updateUser(User user) {
		boolean b = userDao.updateUser(user);
		return b;
	}

	@Override
	public List<User> findByPage(Integer size, Integer page) {
		List<User> page2 = userDao.findByPage(size, page);
		return page2;
	}

}

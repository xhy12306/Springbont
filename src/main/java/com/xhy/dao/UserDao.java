package com.xhy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xhy.pojo.User;

@Mapper
public interface UserDao {

	@Select("select id,name,age from t_user")
	public List<User> findAll();

	@Insert("insert into t_user(id,name,age) values(#{id},#{name},#{age})")
	public boolean insertUser(User user);

	@Delete("delete from t_user where id =#{id}")
	public boolean deleteUser(Integer id);

	@Update("update t_user set name=#{name},age=#{age} where id=#{id}")
	public boolean updateUser(User user);

	@Select("select id,name,age from t_user limit #{size},#{page}")
	public List<User> findByPage(Integer size, Integer page);
}

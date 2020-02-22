package com.example.dao;

import java.util.List;

import com.example.vo.UserVO;

public interface UserDao {
	int create(UserVO userVO);
	List<UserVO> readAll();
	UserVO read(String username);
	int update(UserVO userVO);
	int delete(String username);
}

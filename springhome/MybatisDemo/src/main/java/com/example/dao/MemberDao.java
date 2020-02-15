package com.example.dao;

import java.util.List;

import com.example.vo.MemberVO;

public interface MemberDao {
	void create(MemberVO member);
	MemberVO read(String userid);
	List<MemberVO> readAll();
	void update(MemberVO member);
	void delete(String userid);
}

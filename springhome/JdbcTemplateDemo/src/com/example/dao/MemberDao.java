package com.example.dao;

import java.util.List;

import com.example.vo.MemberVO;

public interface MemberDao {
	int insert(MemberVO member);
	MemberVO select(String userid);
	List<MemberVO> selectAll();
	int update(MemberVO member);
	int delete(String userid);
}

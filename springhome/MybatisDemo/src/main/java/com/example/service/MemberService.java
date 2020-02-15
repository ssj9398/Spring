package com.example.service;

import java.util.List;

import com.example.vo.MemberVO;

public interface MemberService {
	void insertMember(MemberVO member);
	MemberVO selectMember(String userid);
	List<MemberVO> selectAllMember();
	void updateMember(MemberVO member);
	void deleteMember(String userid);
}

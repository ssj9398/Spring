package com.example.service;

import java.util.List;

import com.example.vo.MemberVO;

public interface MemberService {
	int insertMember(MemberVO member);
	MemberVO selectMember(String userid);
	List<MemberVO> selectAllMember();
	int updateMember(MemberVO member);
	int deleteMember(String userid);
}

package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDao;
import com.example.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;
	
	@Override
	public int insertMember(MemberVO member) {
		return this.memberDao.insert(member);
	}

	@Override
	public MemberVO selectMember(String userid) {
		return this.memberDao.select(userid);
	}

	@Override
	public List<MemberVO> selectAllMember() {
		return this.memberDao.selectAll();
	}

	@Override
	public int updateMember(MemberVO member) {
		return this.memberDao.update(member);
	}

	@Override
	public int deleteMember(String userid) {
		return this.memberDao.delete(userid);
	}

}

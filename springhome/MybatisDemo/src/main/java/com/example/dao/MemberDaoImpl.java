package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.vo.MemberVO;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public void create(MemberVO member) {
		int row = this.sqlSession.insert("Member.insert", member);
		if(row == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure.");
	}

	@Override
	public MemberVO read(String userid) {
		return this.sqlSession.selectOne("Member.select", userid);
	}

	@Override
	public List<MemberVO> readAll() {
		return this.sqlSession.selectList("Member.selectall");
	}

	@Override
	public void update(MemberVO member) {
		this.sqlSession.update("Member.update", member);
	}

	@Override
	public void delete(String userid) {
		this.sqlSession.delete("Member.delete", userid);
	}

}

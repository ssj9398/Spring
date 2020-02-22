package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.vo.UserVO;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	class UserMapper implements RowMapper<UserVO> {
		public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			UserVO user = new UserVO();
			user.setUsername(rs.getString("username"));
			user.setAge(rs.getInt("age"));
			return user;
		}
	}

	@Override
	public int create(UserVO userVO) {
		String sql = "INSERT INTO test.user(username, age) VALUES(?, ?)";
		return this.jdbcTemplate.update(sql, userVO.getUsername(), userVO.getAge());
	}

	@Override
	public List<UserVO> readAll() {
		String sql = "SELECT * FROM test.user";
		return this.jdbcTemplate.query(sql, new UserMapper());
	}

	@Override
	public UserVO read(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(UserVO userVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

}

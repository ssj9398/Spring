package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vo.UserVO;

@Repository("userDao")
public class UserDaoimpl implements UserDao {

	private DataSource dataSource;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(UserVO user) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = this.dataSource.getConnection();
			String sql = "INSERT INTO users (userid, name, gender,city) VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserid());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getGender());
			pstmt.setString(4, user.getCity());
			pstmt.executeUpdate();
			conn.commit();
			System.out.println("등록된 Record UserId=" + user.getUserid() + " Name=" + user.getName());
		} catch (SQLException ex) {
			System.out.println(ex);
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException ex) {
				System.out.println(ex);
			}
		}
	}

	@Override
	public List<UserVO> readAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<UserVO> userList = null;
		try {
			conn = this.dataSource.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users");
			userList = new ArrayList<UserVO>();
			while (rs.next()) {
				UserVO userVO = new UserVO(rs.getString("userid"), rs.getString("name"), rs.getString("gender"),
						rs.getString("city"));
				userList.add(userVO);
			}
		} catch (SQLException ex) {
			System.out.println(ex);
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException ex) {
				System.out.println(ex);
			}
		}
		return userList;
	}

	@Override
	public void update(UserVO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserVO read(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserVO userVO = null;
		try {
			conn = this.dataSource.getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM users WHERE userid = ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			rs.next();
			userVO = new UserVO(rs.getString("userid"), rs.getString("name"), rs.getString("gender"),
					rs.getString("city"));
		} catch (SQLException ex) {
			System.out.println(ex);
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException ex) {
				System.out.println(ex);
			}
		}
		return userVO;
	}

}

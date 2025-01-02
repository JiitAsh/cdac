package springmvctwo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvctwo.beans.Users;

public class UsersRowMapper implements RowMapper<Users> {

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Users objUser =new Users();
		objUser.setEmail(rs.getString("email"));
		objUser.setUserName(rs.getString("userName"));
		objUser.setName(rs.getString("name"));
		objUser.setPassword(rs.getString("password"));
		
		return objUser;
	}

}

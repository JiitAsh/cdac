package springmvctwo.dao;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import springmvctwo.beans.Users;

@Component
public class UsersDAOImplementation implements UsersDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	Environment env;

	String sqlReg;
	String sqlChngPwd;
	String sqlAllUsers;
	String sqlUserDetails;
	String sqlDelete;

	@PostConstruct
	public void init() {
		sqlReg = env.getProperty("sql.reguser");
		sqlChngPwd = env.getProperty("sql.chngpwd");
		sqlAllUsers = env.getProperty("sql.alluser");
		sqlUserDetails = env.getProperty("sql.userdetails");
		sqlDelete = env.getProperty("sql.deleteuser");
	}

	@Override
	public boolean registerUser(String userName, String password, String name, String email) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(sqlReg, userName, password, name, email);
		return true;
	}

	@Override
	public boolean changePassword(String userName, String password) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(sqlChngPwd, userName, password);
		return true;
	}

	@Override
	public Users getUserDetails(String userName) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(sqlUserDetails,new UsersRowMapper(), userName);
	}

	@Override
	public Iterator<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(sqlAllUsers, new UsersRowMapper()).iterator();
		
	}

	@Override
	public void deleteUser(String userName) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(sqlDelete,userName);
		System.out.println("user " + userName + " deleted.....");
	}

}

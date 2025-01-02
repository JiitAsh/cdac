package fi.springJdbcDao.dao;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import fi.springJdbcDao.beans.Users;
import jakarta.annotation.PostConstruct;

@Component
public class UsersDAOImplementation implements UsersDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	Environment env;

	String sqlRegister;
	String sqlChangePassword;
	String sqlAllUsers;
	String sqlUserDetails;

	@PostConstruct
	public void initialize() {
		sqlRegister = env.getProperty("sql.registeruser");
		sqlChangePassword = env.getProperty("sql.changepassword");
		sqlAllUsers = env.getProperty("sql.allusers");
		sqlUserDetails = env.getProperty("sql.userdetails");
	}

	@Override
	public boolean registerUser(String userName, String password, String name, String email) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(sqlRegister, userName, password, name, email);
		return false;
	}

	@Override
	public boolean changePassword(String userName, String password) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(sqlChangePassword, userName, password);
		return false;
	}

	@Override
	public Users getUserDetails(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Users> getAllUsers() {
		// TODO Auto-generated method stub
		
		return jdbcTemplate.query(sqlAllUsers, new UsersRowMapper()).iterator();
	}

}

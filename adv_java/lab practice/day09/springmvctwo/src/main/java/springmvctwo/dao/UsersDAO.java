package springmvctwo.dao;

import java.util.Iterator;

import springmvctwo.beans.Users;

public interface UsersDAO {
	public boolean registerUser(String userName, String password, String name, String email);

	public boolean changePassword(String userName, String password);

	public Users getUserDetails(String userName);

	public Iterator<Users> getAllUsers();
	
	public void deleteUser(String userName);
}

package cdac.microusers.services;

import java.util.List;

import cdac.microusers.dto.UsersDTO;

public interface UsersService {
	public UsersDTO getUserDetails(String userName);
	public List<UsersDTO> allUsers();
}

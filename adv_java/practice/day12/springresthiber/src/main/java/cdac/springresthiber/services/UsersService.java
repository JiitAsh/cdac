package cdac.springresthiber.services;

import java.util.List;

import cdac.springresthiber.dto.UsersDTO;

public interface UsersService {
	public UsersDTO getUsersByName(String userName);
	public List<UsersDTO> allUsers(int pageNo, int pageSize);
}

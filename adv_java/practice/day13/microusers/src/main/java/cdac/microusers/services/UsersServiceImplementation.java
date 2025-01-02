package cdac.microusers.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdac.microusers.dto.UsersDTO;
import cdac.microusers.entity.Users;
import cdac.microusers.repositories.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService {

	@Autowired
	UsersRepository usersRepo;

	@Override
	public UsersDTO getUserDetails(String userName) {
		Users userEntity = usersRepo.findById(userName).get();
		UsersDTO dto = new UsersDTO();
		BeanUtils.copyProperties(userEntity, dto);
		return dto;
	}

	@Override
	public List<UsersDTO> allUsers() {
		List<Users> entityList = usersRepo.findAll();
		ArrayList<UsersDTO> finalList = new ArrayList<>();

		for (Users userEntity : entityList) {

			UsersDTO dto = new UsersDTO();
			BeanUtils.copyProperties(userEntity, dto);
			finalList.add(dto);
		}
		return finalList;
	}

}

package cdac.microusers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cdac.microusers.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String>{

}

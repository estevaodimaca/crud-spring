package mz.com.dimasoft.crudspring.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import mz.com.dimasoft.crudspring.auth.entity.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByNuit(String nuit);

	UserDetails findByUsername(String username);
}

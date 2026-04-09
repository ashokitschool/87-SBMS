package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}

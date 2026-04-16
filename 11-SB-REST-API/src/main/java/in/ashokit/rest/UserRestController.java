package in.ashokit.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.dto.User;
import in.ashokit.repo.UserRepo;

@RestController
public class UserRestController {

	@Autowired
	private UserRepo userRepo;
	
	@GetMapping(value="/users", produces ="application/json")
	public ResponseEntity<List<User>> getUsers(){
		
		List<User> usersList = userRepo.findAll();
		
		return ResponseEntity.status(200)
							 .body(usersList);
	}
	
	
	@GetMapping(value="/user/{userId}", produces="application/json")
	public ResponseEntity<User> getUserById(@PathVariable Integer userId){
		
		Optional<User> user = userRepo.findById(userId);
		
		if(user.isPresent()) {
			return ResponseEntity.status(200)
					 		     .body(user.get());
		}else {
			return ResponseEntity.status(400)
								 .body(null);
		}
	}
	
	@GetMapping(value="/user", produces="application/json")
	public ResponseEntity<User> getUser(@RequestParam("userId") Integer userId){
		
		Optional<User> user = userRepo.findById(userId);
		
		if(user.isPresent()) {
			return ResponseEntity.status(200)
					 		     .body(user.get());
		}else {
			return ResponseEntity.status(400)
								 .body(null);
		}
	}
}

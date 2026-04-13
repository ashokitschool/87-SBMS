package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.dto.User;
import in.ashokit.repo.UserRepo;

@Controller
public class UserController {

	@Autowired
	private UserRepo userRepo;

	@GetMapping("/")
	public String loadUserForm(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/save-user")
	public String handleUserFormSubmission(User user, Model model) {
		userRepo.save(user);
		model.addAttribute("msg", "User Saved");
		return "index";
	}

	@GetMapping("/users")
	public String getAllUsers(Model model) {
		List<User> usersList = userRepo.findAll();
		model.addAttribute("users", usersList);
		return "view-users";
	}

	@GetMapping("/edit-user/{userId}")
	public String editUser(@PathVariable Integer userId, Model model) {
		User userObj = userRepo.findById(userId).get();
		model.addAttribute("user", userObj);
		return "edit-user";
	}

	@PostMapping("/update-user")
	public String updateUser(User user, Model model) {
		userRepo.save(user);
		model.addAttribute("msg", "User Updated");
		return "edit-user";
	}

	@GetMapping("/delete-user/{userId}")
	public String deleteUser(@PathVariable Integer userId, Model model) {
		if (userRepo.existsById(userId)) {
			userRepo.deleteById(userId);
		}
		return "redirect:/users";
	}

}

package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.dto.User;

@Controller
public class UserController {

	@GetMapping("/")
	public String loadUserForm(Model model) {

		model.addAttribute("user", new User());

		return "index";
	}

	@PostMapping("/save-user")
	public String handleUserFormSubmission(User user, Model model) {

		System.out.println(user);

		model.addAttribute("msg", user.getUname() + " Record Saved...");

		return "success";
	}
}

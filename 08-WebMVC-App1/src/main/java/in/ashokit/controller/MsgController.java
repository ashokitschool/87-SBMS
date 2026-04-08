package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "Welcome to Spring Web MVC");
		mav.setViewName("index");

		return mav;
	}

	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "Good Morning");
		mav.setViewName("index");

		return mav;
	}
	
	
	@GetMapping("/quote")
	public String getQuote(Model model) {
		
		model.addAttribute("msg", "“Success doesn’t come from what you do occasionally, it comes from what you do consistently.” 💡");
		
		return "index";
	}

}

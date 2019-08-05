package com.zensar.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@PostMapping("/validation")
	public String validate(User user,ModelMap map){
		if(user.getUsername().equals("Manali") && user.getPassword().equals("626254")){
			
			map.addAttribute("user", user);
			return "success";
			
		}else{
			map.addAttribute("logonError", "Invalid user");
			return "login";
		}
	}
}

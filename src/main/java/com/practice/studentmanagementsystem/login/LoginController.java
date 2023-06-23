package com.practice.studentmanagementsystem.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {

//	private Logger logger = LoggerFactory.getLogger(getClass());
//
//	@RequestMapping("login")
//	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//		model.put("name", name);
//		logger.debug("Request param is {}", name);
//		logger.info("I want this printerd at info level {}", name);
//		logger.warn("I want this printerd at warning level {}", name);
//		return "login";
//	}
//	

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}
}



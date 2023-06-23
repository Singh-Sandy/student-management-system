package com.practice.studentmanagementsystem.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping("login")
	public String gotoLoginPage() {
		
		return "login";
	}
}

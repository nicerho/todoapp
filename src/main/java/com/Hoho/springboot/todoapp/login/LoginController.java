package com.Hoho.springboot.todoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("loginasdf")
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	public String loginJsp(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "login";
	}
}

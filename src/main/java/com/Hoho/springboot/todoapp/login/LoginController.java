package com.Hoho.springboot.todoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	private AuthenticationService authenticationService;

	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	public String loginJsp() {

		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (authenticationService.authentication(name, password)) {

			model.put("name", name);

			// name - Ho
			// password - 123123

			return "welcome";
		} else {

			model.put("errorMessage", "Invalid Approach");
			return "login";
		}

	}
}

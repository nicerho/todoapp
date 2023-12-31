package com.Hoho.springboot.todoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hey there";
	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>wowowow</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("wowowow");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}

	@RequestMapping("say-hello-jsp")
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	public String sayHelloJsp() {

		return "sayHello";
	}
}

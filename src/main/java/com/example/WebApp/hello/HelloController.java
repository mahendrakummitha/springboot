package com.example.WebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	// "say-hello" -> "Hello! What are you learning today"

	@RequestMapping("/hello")
	@ResponseBody
	public String Hello() {
		return "Hello! What are you learning today";
	}

	@RequestMapping("/hello-html")
	@ResponseBody
	public String HelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My Title </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My Body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}

	// Hello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/Hello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/Hello2.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	@RequestMapping("/hello-JSP")
	public String HelloJSP() {
		return "Hello";
	}
	
	@RequestMapping("/4444")
	public String Todo() {
		return "ListTodos";
	}

}

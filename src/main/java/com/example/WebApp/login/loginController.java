package com.example.WebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	
	//http://loclahost/login?name=mahendra
	//model
	@RequestMapping("/login")
	public String HelloJSP(@RequestParam String name, ModelMap model) {
		model.put("name",name);	
		System.out.println("request parameter :: " + name);
		return "login";
	}

}


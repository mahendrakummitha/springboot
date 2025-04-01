package com.example.WebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginPage {
	private AuthenticationService AuthenticationService;
// for the above code it will throw null pointer error 
//	private AuthenticationService AuthenticationService = new AuthenticationService();
	
	//http://loclahost/login?name=mahendra
	//currenlty handling both get and post request 
	@RequestMapping(value="loginPage",method = RequestMethod.GET)
	public String HelloJSP() {
		return "loginPage";
	}
	
//	@RequestMapping(value="loginPage",method = RequestMethod.POST)
//	public String gotoWelcomePage(@RequestParam String names, @RequestParam String password, ModelMap model) {
//		model.put("names",names);
//		model.put("password",password);
//		return "Welcome";
//	}
	
	public LoginPage(com.example.WebApp.login.AuthenticationService authenticationService) {
		super();
		AuthenticationService = authenticationService;
	}

	@RequestMapping(value = "loginPage", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (AuthenticationService.authenticate(name, password)) {
		
			model.put("name", name);
//			model.put("password", password);
			return "Welcome";

			// authentication
			// name= mahendra
			// password - kkr0224

		}
		model.put("errormeassage", "InvalidCredentials, Please try again");
		return "loginPage"  ;

	}
	

}

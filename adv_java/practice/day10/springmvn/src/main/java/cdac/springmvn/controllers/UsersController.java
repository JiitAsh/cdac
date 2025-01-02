package cdac.springmvn.controllers;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cdac.springmvn.entity.Users;

@Controller
public class UsersController {
	@Autowired
	SessionFactory hibernateFactory;
	
	@RequestMapping("/login")
	public void prepareUsers(Model data) {
		Users objUser=new Users();
		data.addAttribute("objUser",objUser);
	}
	
}

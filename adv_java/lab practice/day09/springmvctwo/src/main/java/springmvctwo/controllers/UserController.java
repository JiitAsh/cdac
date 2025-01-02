package springmvctwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;
import springmvctwo.beans.Users;
import springmvctwo.dao.UsersDAO;

@Controller
public class UserController {

	@Autowired
	UsersDAO userDAO;

	@Autowired
	HttpSession session;

	@RequestMapping("/login")
	public void prepareUser(Model data) {
		Users objUser = new Users();
		data.addAttribute("objUser", objUser);
	}

	@RequestMapping("/newUser")
	public void prepareNewUser(Model data) {
		Users objUser = new Users();
		data.addAttribute("objUser", objUser);
	}

	@RequestMapping("/register")
	public String registerUser(@ModelAttribute("objUser") Users objUser) {
		userDAO.registerUser(objUser.getUserName(), objUser.getPassword(), objUser.getName(), objUser.getEmail());

		return "success";    // it is a url which returning by register and it should be present in web-inf as success.jsp
	}

	@RequestMapping("/authenticate")
	public ModelAndView validateUser(@ModelAttribute("objUser") Users objUser) {
		
		Users dbUser = userDAO.getUserDetails(objUser.getUserName());

		if (objUser.getUserName().equals(dbUser.getUserName()) && objUser.getPassword().equals(dbUser.getPassword())) {
			return new ModelAndView("welcome", "data",
					"Welcome" + objUser.getUserName() + " to the online shopping site");
		} else {
			return new ModelAndView("failure", "message", "Invalid authentication...");
		}
	}
}

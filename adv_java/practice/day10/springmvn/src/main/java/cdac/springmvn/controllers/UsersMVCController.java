package cdac.springmvn.controllers;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UsersMVCController {
	
	RestTemplate restTemplate = new RestTemplate();
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/showusers")
	public void showAllUsers(Model data) {
		
		try {
			int pageNo=Integer.parseInt(request.getParameter("pageNo"));
			URI uri = new URI("http://localhost:85/users/allUsers/" + pageNo + "/2");
			ResponseEntity<String> response =
			restTemplate.getForEntity(uri, String.class);
			data.addAttribute("users",response.getBody());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

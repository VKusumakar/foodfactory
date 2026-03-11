package food.factory.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.factory.user.dto.Userdto;
import food.factory.user.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userServices;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody Userdto userdto) {
		return userServices.registerUser(userdto);
	}

}

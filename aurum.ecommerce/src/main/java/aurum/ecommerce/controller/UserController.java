package aurum.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import aurum.ecommerce.model.User;
import aurum.ecommerce.service.UserService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/usuarios")
public class UserController {
    
	UserService user;
	UserController (UserService user){
		this.user = user;
		
		
		
	}
	@GetMapping
	public List<User> obtenerTodosLosUsuarios(){
		return user.findAll();
	}
	
	
	@PostMapping
	User createUser(@RequestBody User addUser ) {
		User newUser = user.save(addUser);
		return addUser;
	}
	
	
}

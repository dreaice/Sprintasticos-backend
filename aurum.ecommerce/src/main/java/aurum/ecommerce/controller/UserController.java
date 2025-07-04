package aurum.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public UserController (UserService user){
		this.user = user;
		
	}
	@GetMapping
	public List<User> obtenerTodosLosUsuarios(){
		return user.findAll();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<User> ObtenerPorId(@PathVariable("id") Long id){
		
		Optional <User> findUser = user.findById(id);
		return findUser.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
		
	}
	
	@PostMapping
	User createUser(@RequestBody User addUser ) {
		User newUser = user.save(addUser);
		return addUser;
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity <User> updateUser(@PathVariable("id") Long id, @RequestBody User user1) {

		Optional <User> updateUser = user.update(id, user1);
		return updateUser.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
		
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<Void> deleteRole(@PathVariable("id") Long id) {
		user.deleteById(id);
		return ResponseEntity.noContent().build(); // 204- Sin contenido
	}
	
	
}
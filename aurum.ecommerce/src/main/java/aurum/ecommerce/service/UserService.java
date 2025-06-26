package aurum.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aurum.ecommerce.model.User;
import aurum.ecommerce.repository.UserRepository;

@Service
public class UserService {
	
	
    private UserRepository user;
    UserService(UserRepository user){
    	this.user= user;
    }
    public List<User> obtenerTodosLosUsuarios() {
        return user.findAll(); // Aquí se extraen los datos de la Base de Datos
      
    }
    
    public User createdUser(User user1) {
    	return user.save(user1); 
    }
}
    

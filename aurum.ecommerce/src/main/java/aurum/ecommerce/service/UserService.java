package aurum.ecommerce.service;

import java.util.List;
import java.util.Optional;

import aurum.ecommerce.model.User;

public interface UserService {
	List<User> findAll(); // Aquí se extraen los datos de la Base de Datos
	
	List<User> save();
	
		Optional <User> findById(Long id);

		User save(User user);
	
		Optional <User> update(Long id, User user);
		
		void deleteById(Long id);
    
    }
    

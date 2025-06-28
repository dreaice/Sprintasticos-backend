package aurum.ecommerce.service;

import java.util.List;


import aurum.ecommerce.model.User;

public interface UserService {
	List<User> findAll(); // Aquí se extraen los datos de la Base de Datos
	
	List<User> save();
	
		User findById(Long id);

		User save(User user);
	
		User update(Long id, User user);

		User deleteById(Long id);
    

    }
    

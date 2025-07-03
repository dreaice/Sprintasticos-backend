package aurum.ecommerce.service;

import java.util.List;
import java.util.Optional;

import aurum.ecommerce.model.Category;

public interface CategoryService {

	List<Category> findAll(); // Aquí se extraen los datos de la Base de Datos
	
		Category findById(Long id);

		Category save(Category categories);
	
		Optional <Category> update(Long id, Category categories);

		Category deleteById(Long id);
    

	
} 
package aurum.ecommerce.service;

import java.util.List;
import java.util.Optional;

import aurum.ecommerce.model.Stone;

public interface StoneService {

	List<Stone> findAll(); // Aquí se extraen los datos de la Base de Datos
	
		Stone findById(Long id);

		Stone save(Stone stones);
	
		Optional <Stone> update(Long id, Stone stones);

		Stone deleteById(Long id);
    

	
} 
package aurum.ecommerce.service;

import java.util.List;
import java.util.Optional;

import aurum.ecommerce.model.Product;

public interface ProductService {

	List<Product> findAll(); // Aquí se extraen los datos de la Base de Datos
	
		Product findById(Long id);

		Product save(Product products);
	
		Optional <Product> update(Long id, Product products);

		Product deleteById(Long id);
    

	
}

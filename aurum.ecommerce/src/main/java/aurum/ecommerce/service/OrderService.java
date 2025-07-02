package aurum.ecommerce.service;

import java.util.List;
import java.util.Optional;

import aurum.ecommerce.model.Order;

public interface OrderService {

	List<Order> findAll(); // Aquí se extraen los datos de la Base de Datos
	
		Order findById(Long id);

		Order save(Order orders);
	
		Optional <Order> update(Long id, Order orders);

		Order deleteById(Long id);
    

	
} 
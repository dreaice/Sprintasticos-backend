package aurum.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aurum.ecommerce.model.Order;
import aurum.ecommerce.service.OrderService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/orders")
public class OrderController {

	OrderService order;
	public OrderController (OrderService order){
		this.order = order;
	}
	
	@GetMapping
	public List<Order> obtenerTodasLasOrdenes(){
		return order.findAll();
	}
	
	
	@PostMapping
	Order createOrder(@RequestBody Order addOrder ) {
		Order newOrder = order.save(addOrder);
		return addOrder;
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity <Order> updateOrder(@PathVariable("id") Long id, @RequestBody Order order1) {

		Optional <Order> updateOrder = order.update(id, order1);
		return updateOrder.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
} 
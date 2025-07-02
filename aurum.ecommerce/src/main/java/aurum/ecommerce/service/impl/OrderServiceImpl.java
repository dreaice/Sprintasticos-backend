package aurum.ecommerce.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import aurum.ecommerce.model.Order;
import aurum.ecommerce.repository.OrderRepository;
import aurum.ecommerce.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	OrderRepository orderRepository;
	OrderServiceImpl (OrderRepository orderRepository){
		this.orderRepository = orderRepository;
	}

	@Override
	public List<Order> findAll() { //Muestra lista total de órdenes
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}


	@Override
	public Order findById(Long id) { //Muestra órdenes por id 
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order save(Order orders) {
		// TODO Auto-generated method stub
		return orderRepository.save(orders);
	}

	@Override
	public Optional<Order> update(Long id, Order orders) {
		return orderRepository.findById(id).map(existeOrden -> { //Se hace la busqueda de la orden por id
			existeOrden.setOrder_date(orders.getOrder_date());
			existeOrden.setTotal_amount(orders.getTotal_amount());
			existeOrden.setUser(orders.getUser());
			existeOrden.setProducts(orders.getProducts());
		return orderRepository.save(existeOrden);
		}
		);
	}

	@Override
	public Order deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	

} 
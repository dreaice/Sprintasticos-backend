package aurum.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aurum.ecommerce.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

} 
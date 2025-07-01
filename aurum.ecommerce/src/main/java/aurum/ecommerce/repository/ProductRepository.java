package aurum.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aurum.ecommerce.model.Product;
import aurum.ecommerce.model.User;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}

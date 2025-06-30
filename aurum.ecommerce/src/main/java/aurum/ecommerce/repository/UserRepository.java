package aurum.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aurum.ecommerce.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}

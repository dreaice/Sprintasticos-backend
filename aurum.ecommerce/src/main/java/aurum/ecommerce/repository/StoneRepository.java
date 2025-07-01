package aurum.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aurum.ecommerce.model.Stone;
import aurum.ecommerce.model.User;

@Repository
public interface StoneRepository extends JpaRepository<Stone, Long>{

}

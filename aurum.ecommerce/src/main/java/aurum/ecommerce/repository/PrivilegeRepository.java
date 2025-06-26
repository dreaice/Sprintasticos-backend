package aurum.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aurum.ecommerce.model.Privilege;

@Repository
public interface PrivilegeRepository extends CrudRepository<Privilege, Long> {

}

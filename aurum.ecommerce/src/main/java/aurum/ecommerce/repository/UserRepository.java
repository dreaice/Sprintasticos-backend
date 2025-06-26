package aurum.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import aurum.ecommerce.model.User;

public interface UserRepository extends CrudRepository<User, Long> {


}

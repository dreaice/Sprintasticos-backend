package aurum.ecommerce.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aurum.ecommerce.model.Category;
import aurum.ecommerce.model.User;


@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long>{

}

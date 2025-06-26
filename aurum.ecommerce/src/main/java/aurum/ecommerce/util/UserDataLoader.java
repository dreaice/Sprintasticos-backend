package aurum.ecommerce.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.*;

import aurum.ecommerce.repository.UserRepository;

@Component
@Order(1)
public class UserDataLoader implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}

package aurum.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import aurum.ecommerce.model.User;
import aurum.ecommerce.repository.UserRepository;

@Service
public class  UserServiceImpl implements UserService {

UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
}

    @Override
    public List<User> findAll() {

        return userRepository.findAll();
    }


	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User update(Long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> save() {
		// TODO Auto-generated method stub
		return null;
	}
    
	
	
    
}

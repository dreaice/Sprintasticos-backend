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
    
}

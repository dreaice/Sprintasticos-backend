package aurum.ecommerce.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import aurum.ecommerce.model.User;
import aurum.ecommerce.repository.UserRepository;
import aurum.ecommerce.service.UserService;
import jakarta.persistence.EntityNotFoundException;

@Service
public class  UserServiceImpl implements UserService {

	UserRepository userRepository ;
    public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
}

    @Override
    public List<User> findAll() {

        return userRepository.findAll();
    }

    @Override
	public Optional<User> findById(Long id) {
		
		return userRepository.findById(id);
	}
	

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	
	
	

	@Override
	public List<User> save() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> update(Long id, User user) {
	    return userRepository.findById(id).map(existeUsuario -> {
	        existeUsuario.setName(user.getName());
	        existeUsuario.setEmail(user.getEmail());
	        existeUsuario.setPassword(user.getPassword());
	        existeUsuario.setPhone(user.getPhone());
	        existeUsuario.setAddress(user.getAddress());
	        existeUsuario.setRoles(user.getRoles());
	        return userRepository.save(existeUsuario);
	    });
	}

	@Override
	public void deleteById(Long id) {
		Optional <User> existeUsuarios= findById(id);
		User user = existeUsuarios.get();
		user.getRoles().clear();
		userRepository.save(user);
		userRepository.delete(user);
		
	}

	}
    

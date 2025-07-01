package aurum.ecommerce.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import aurum.ecommerce.model.Stone;
import aurum.ecommerce.repository.StoneRepository;
import aurum.ecommerce.service.StoneService;

@Service
public class StoneServiceImpl implements StoneService {

	StoneRepository stoneRepository;
	StoneServiceImpl (StoneRepository stoneRepository){
		this.stoneRepository = stoneRepository;
	}

	@Override
	public List<Stone> findAll() { //Muestra lista total de piedras
		// TODO Auto-generated method stub
		return stoneRepository.findAll();
	}


	@Override
	public Stone findById(Long id) { //Muestra piedras por id 
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stone save(Stone stones) {
		// TODO Auto-generated method stub
		return stoneRepository.save(stones);
	}

	@Override
	public Optional<Stone> update(Long id, Stone stones) {
		return stoneRepository.findById(id).map(existePiedra -> { //Se hace la busqueda de la piedra por id
			existePiedra.setStone_name(stones.getStone_name());
			existePiedra.setProductos(stones.getProductos());
		return stoneRepository.save(existePiedra);
		}
		);
	}

	@Override
	public Stone deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	

} 
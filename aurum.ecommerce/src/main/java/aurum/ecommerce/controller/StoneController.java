package aurum.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aurum.ecommerce.model.Stone;
import aurum.ecommerce.service.StoneService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/stones")
public class StoneController {

	StoneService stone;
	public StoneController (StoneService stone){
		this.stone = stone;
	}
	
	@GetMapping
	public List<Stone> obtenerTodasLasPiedras(){
		return stone.findAll();
	}
	
	
	@PostMapping
	Stone createStone(@RequestBody Stone addStone ) {
		Stone newStone = stone.save(addStone);
		return addStone;
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity <Stone> updateStone(@PathVariable("id") Long id, @RequestBody Stone stone1) {

		Optional <Stone> updateStone = stone.update(id, stone1);
		return updateStone.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
} 
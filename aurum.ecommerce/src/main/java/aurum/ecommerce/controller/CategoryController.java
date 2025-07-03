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

import aurum.ecommerce.model.Category;
import aurum.ecommerce.service.CategoryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	CategoryService category;
	public CategoryController (CategoryService category){
		this.category = category;
	}
	
	@GetMapping
	public List<Category> obtenerTodasLasCategorias(){
		return category.findAll();
	}
	
	
	@PostMapping
	Category createCategory(@RequestBody Category addCategory ) {
		Category newCategory = category.save(addCategory);
		return addCategory;
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity <Category> updateCategory(@PathVariable("id") Long id, @RequestBody Category category1) {

		Optional <Category> updateCategory = category.update(id, category1);
		return updateCategory.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
} 
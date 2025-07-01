package aurum.ecommerce.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import aurum.ecommerce.model.Category;
import aurum.ecommerce.repository.CategoryRepository;
import aurum.ecommerce.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	CategoryRepository categoryRepository;
	CategoryServiceImpl (CategoryRepository categoryRepository){
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Category> findAll() { //Muestra lista total de categorías
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}


	@Override
	public Category findById(Long id) { //Muestra categorías por id 
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category save(Category categories) {
		// TODO Auto-generated method stub
		return categoryRepository.save(categories);
	}

	@Override
	public Optional<Category> update(Long id, Category categories) {
		return categoryRepository.findById(id).map(existeCategoria -> { //Se hace la busqueda de la categoría por id
			existeCategoria.setCategory_name(categories.getCategory_name());
			existeCategoria.setProductos(categories.getProductos());
		return categoryRepository.save(existeCategoria);
		}
		);
	}

	@Override
	public Category deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	

} 
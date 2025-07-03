package aurum.ecommerce.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import aurum.ecommerce.model.Product;
import aurum.ecommerce.repository.ProductRepository;
import aurum.ecommerce.service.ProductService;
import jakarta.persistence.EntityNotFoundException;
@Service
public class ProductServiceImpl implements ProductService {

	ProductRepository productRepository;
	ProductServiceImpl (ProductRepository productRepository){
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAll() { //Muestra lista total de productos
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}


	@Override
	public Product findById(Long id) { //Muestra productos por id 
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product save(Product products) {
		// TODO Auto-generated method stub
		return productRepository.save(products);
	}

	@Override
	public Optional<Product> update(Long id, Product products) {
		return productRepository.findById(id).map(existeProducto -> { //Se hace la busqueda del producto por id
			existeProducto.setName(products.getName());
			existeProducto.setDescription(products.getDescription());
			existeProducto.setPrice(products.getPrice());
			existeProducto.setMaterial(products.getMaterial());
			existeProducto.setImage_url(products.getImage_url());
			existeProducto.setStock(products.getStock());
			existeProducto.setCategory(products.getCategory());
			existeProducto.setStone(products.getStone());
		return productRepository.save(existeProducto);
		}
		);
	}

	@Override
	public void deleteById(Long id) {
	Product product = productRepository.findById(id)
			.orElseThrow(()-> new EntityNotFoundException("usuario no encontrado"));
		productRepository.delete(product);
	
	
	
	
		
	}

	
	

	
	

}

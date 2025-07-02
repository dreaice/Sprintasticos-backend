package aurum.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aurum.ecommerce.model.Product;
import aurum.ecommerce.service.ProductService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/productos")
public class ProductController {

	ProductService product;
	public ProductController (ProductService product){
		this.product = product;
	}
	
	@GetMapping
	public List<Product> obtenerTodosLosProductos(){
		return product.findAll();
	}
	
	
	@PostMapping
	Product createProduct(@RequestBody Product addProduct ) {
		Product newProduct = product.save(addProduct);
		return addProduct;
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity <Product> updateProduct(@PathVariable("id") Long id, @RequestBody Product product1) {

		Optional <Product> updateProduct = product.update(id, product1);
		return updateProduct.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable("id") Long id) {
		product.deleteById(id);
	}
}

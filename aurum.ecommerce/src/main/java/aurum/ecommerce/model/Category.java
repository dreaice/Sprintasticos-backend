package aurum.ecommerce.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "categories")
public class Category {

	/**
	 * Columns:
id_category bigint AI PK 
category_name varchar(100)
	**/

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_category;

	@Column(name="category_name", nullable = false, length = 50) 
	private String category_name;
	
	
	@OneToMany(mappedBy = "category") //Para crear lista que tenemos en categoria
	@JsonManagedReference(value = "categoria-productos") 
	private List<Product> productos;


	public Long getId_category() {
		return id_category;
	}


	public void setId_category(Long id_category) {
		this.id_category = id_category;
	}


	public String getCategory_name() {
		return category_name;
	}


	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}


	public List<Product> getProductos() {
		return productos;
	}


	public void setProductos(List<Product> productos) {
		this.productos = productos;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [id_category=");
		builder.append(id_category);
		builder.append(", category_name=");
		builder.append(category_name);
		builder.append(", productos=");
		builder.append(productos);
		builder.append(", getId_category()=");
		builder.append(getId_category());
		builder.append(", getCategory_name()=");
		builder.append(getCategory_name());
		builder.append(", getProductos()=");
		builder.append(getProductos());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}

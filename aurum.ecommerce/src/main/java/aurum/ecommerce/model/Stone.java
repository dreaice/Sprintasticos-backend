package aurum.ecommerce.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "stones")
public class Stone {
 
	/**
	 * Columns:
	id_stone bigint AI PK 
		stone_name varchar(100)
	**/

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_stone;

	@Column(name="stone_name", nullable = false, length = 50) 
	private String stone_name;
	
	
	@OneToMany(mappedBy = "stone") 
	@JsonManagedReference(value = "stone-productos")
	private List<Product> productos;
	

	public Long getId_stone() {
		return id_stone;
	}


	public void setId_stone(Long id_stone) {
		this.id_stone = id_stone;
	}


	public String getStone_name() {
		return stone_name;
	}


	public void setStone_name(String stone_name) {
		this.stone_name = stone_name;
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
		builder.append("Stone [id_stone=");
		builder.append(id_stone);
		builder.append(", stone_name=");
		builder.append(stone_name);
		builder.append(", productos=");
		builder.append(productos);
		builder.append(", getId_stone()=");
		builder.append(getId_stone());
		builder.append(", getStone_name()=");
		builder.append(getStone_name());
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

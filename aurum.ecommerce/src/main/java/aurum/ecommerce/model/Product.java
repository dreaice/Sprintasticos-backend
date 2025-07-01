package aurum.ecommerce.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "jewelry_pieces")
public class Product {
/**
Columns:
id_jewelry bigint AI PK 
name varchar(100) 
description text 
price decimal(10,2) 
material varchar(50) 
image_url text 
stock int 
id_category bigint 
id_stone bigint

**/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_product;

	@Column(name="name", nullable = false, length = 50) 
	private String name;

	@Column(name="description", nullable = false, length = 50) 
	private String description;

	@Column(name="price", nullable = false, length = 50) 
	private float price;

	@Column(name="material", nullable = false, length = 50) 
	private String material;

	@Column(name="image_url", nullable = false, length = 150) 
	private String image_url;
	
	@Column(name="stock", nullable = false, length = 50) 
	private int stock;

	// Relación muchos a muchos con la entidad Rol
    @ManyToOne(fetch = FetchType.EAGER) // EAGER carga los roles junto con el usuario
    @JoinColumn(
        name = "id_stone" 
    ) 
    
    private Stone stone;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn( name = "id_category")
    
    private Category category;

	public Long getId_product() {
		return id_product;
	}

	public void setId_product(Long id_product) {
		this.id_product = id_product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Stone getStone() {
		return stone;
	}

	public void setStone(Stone stone) {
		this.stone = stone;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id_product=");
		builder.append(id_product);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", price=");
		builder.append(price);
		builder.append(", material=");
		builder.append(material);
		builder.append(", image_url=");
		builder.append(image_url);
		builder.append(", stock=");
		builder.append(stock);
		builder.append(", stone=");
		builder.append(stone);
		builder.append(", category=");
		builder.append(category);
		builder.append(", getId_product()=");
		builder.append(getId_product());
		builder.append(", getName()=");
		builder.append(getName());
		builder.append(", getDescription()=");
		builder.append(getDescription());
		builder.append(", getPrice()=");
		builder.append(getPrice());
		builder.append(", getMaterial()=");
		builder.append(getMaterial());
		builder.append(", getImage_url()=");
		builder.append(getImage_url());
		builder.append(", getStock()=");
		builder.append(getStock());
		builder.append(", getStone()=");
		builder.append(getStone());
		builder.append(", getCategory()=");
		builder.append(getCategory());
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



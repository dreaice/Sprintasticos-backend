package aurum.ecommerce.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_order;

	@Column(name="order_date", nullable = false) 
	private LocalDateTime order_date;

	@Column(name="total_amount", nullable = false, precision = 10, scale = 2) 
	private BigDecimal total_amount;

	// Relación muchos a uno con User
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user") 
    private User user;

	// Relación muchos a muchos con Product
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "order_has_jewelry_pieces", 
        joinColumns = @JoinColumn(name = "id_order"), 
        inverseJoinColumns = @JoinColumn(name = "id_jewelry") 
    )
	private Set<Product> products = new HashSet<>();

	public Order() {
	}

	public Long getId_order() {
		return id_order;
	}

	public void setId_order(Long id_order) {
		this.id_order = id_order;
	}

	public LocalDateTime getOrder_date() {
		return order_date;
	}

	public void setOrder_date(LocalDateTime order_date) {
		this.order_date = order_date;
	}

	public BigDecimal getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(BigDecimal total_amount) {
		this.total_amount = total_amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [id_order=");
		builder.append(id_order);
		builder.append(", order_date=");
		builder.append(order_date);
		builder.append(", total_amount=");
		builder.append(total_amount);
		builder.append(", user=");
		builder.append(user);
		builder.append(", products=");
		builder.append(products);
		builder.append("]");
		return builder.toString();
	}
} 
package aurum.ecommerce.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_user;

	@Column(name="name", nullable = false, length = 50) // falta revisar que va en length de aqui en adelante
	private String name;

	@Column(name="email", nullable = false, length = 50, unique =true) 
	private String email;

	@Column(name="password", nullable = false, length = 50) 
	private String password;

	@Column(name="phone", nullable = false, length = 50) 
	private String phone;

	@Column(name="address", nullable = false, length = 50) 
	private String address;

	// Relación muchos a muchos con la entidad Rol
    @ManyToMany(fetch = FetchType.EAGER) // EAGER carga los roles junto con el usuario
    @JoinTable(
        name = "user_has_privilege", // Nombre de la tabla intermedia en la base de datos
        joinColumns = @JoinColumn(name = "id_user"), // Clave foránea hacia la tabla usuarios
        inverseJoinColumns = @JoinColumn(name = "id_privilege") // Clave foránea hacia la tabla roles
    )
	private Set<Privilege> roles = new HashSet<>();
	

	
	public Set<Privilege> getRoles() {
		return roles;
	}
	public void setRoles(Set<Privilege> roles) {
		this.roles = roles;
	}
	public User() {
	}
	public Long getId_user() {
		return id_user;
	}
	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id_user=");
		builder.append(id_user);
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

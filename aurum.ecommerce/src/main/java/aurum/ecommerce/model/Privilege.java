package aurum.ecommerce.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name= "privileges")
public class Privilege {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)


private long id_privilege;

@Column(name="privilege_name", nullable= false, length= 50) // Hay que verificar length
private String privilege_name;



@ManyToMany(mappedBy= "roles", fetch= FetchType.EAGER) 
private Set <User> usuarios=new HashSet();


public long getId_privilege() {
	return id_privilege;
}

public void setId_privilege(long id_privilege) {
	this.id_privilege = id_privilege;
}

public String getPrivilege_name() {
	return privilege_name;
}

public void setPrivilege_name(String privilege_name) {
	this.privilege_name = privilege_name;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Privilege [id_privilege=");
	builder.append(id_privilege);
	builder.append(", privilege_name=");
	builder.append(privilege_name);
	builder.append("]");
	return builder.toString();
} 



}

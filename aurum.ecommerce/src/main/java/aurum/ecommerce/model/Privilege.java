package aurum.ecommerce.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table (name= "privileges")
public class Privilege {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id_privilege;
private String privilege_name;

public Privilege(long id_privilege, String privilege_name) {
	super();
	this.id_privilege = id_privilege;
	this.privilege_name = privilege_name;
}

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

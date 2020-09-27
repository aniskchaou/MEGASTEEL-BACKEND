package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Client {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
private String tva;
private String adresse;
private String telephone;
private String fax;
private String email;
public Client() {
	// TODO Auto-generated constructor stub
}
public Client(String code, String tva, String adresse, String telephone, String fax, String email) {
	super();
	this.code = code;
	this.tva = tva;
	this.adresse = adresse;
	this.telephone = telephone;
	this.fax = fax;
	this.email = email;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getTva() {
	return tva;
}
public void setTva(String tva) {
	this.tva = tva;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getFax() {
	return fax;
}
public void setFax(String fax) {
	this.fax = fax;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}

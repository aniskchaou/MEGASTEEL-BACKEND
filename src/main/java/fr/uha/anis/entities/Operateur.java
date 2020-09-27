package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Operateur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	  private String code;
private String  nom;
private String prenom;
private String telephone;
private String email;
private String etat;
public Operateur() {
	// TODO Auto-generated constructor stub
}
public Operateur(String code, String nom, String prenom, String telephone, String email, String etat) {
	super();
	this.code = code;
	this.nom = nom;
	this.prenom = prenom;
	this.telephone = telephone;
	this.email = email;
	this.etat = etat;
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
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}


}

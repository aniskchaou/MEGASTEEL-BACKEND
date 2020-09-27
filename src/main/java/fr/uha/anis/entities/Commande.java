package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 private String numCommande;
private String dateCreation;
private  String dateLimite;
private  String etat;
public Commande() {
	// TODO Auto-generated constructor stub
}
public Commande(String numCommande, String dateCreation, String dateLimite, String etat) {
	super();
	this.numCommande = numCommande;
	this.dateCreation = dateCreation;
	this.dateLimite = dateLimite;
	this.etat = etat;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNumCommande() {
	return numCommande;
}
public void setNumCommande(String numCommande) {
	this.numCommande = numCommande;
}
public String getDateCreation() {
	return dateCreation;
}
public void setDateCreation(String dateCreation) {
	this.dateCreation = dateCreation;
}
public String getDateLimite() {
	return dateLimite;
}
public void setDateLimite(String dateLimite) {
	this.dateLimite = dateLimite;
}
public String getEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}


}

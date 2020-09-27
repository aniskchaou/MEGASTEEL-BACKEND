package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Machine {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 private String nom;
private String production;
private String fonctionnement;
private String tempsArret;
private String etat;
public Machine() {
	// TODO Auto-generated constructor stub
}
public Machine(String nom, String production, String fonctionnement, String tempsArret, String etat) {
	super();
	this.nom = nom;
	this.production = production;
	this.fonctionnement = fonctionnement;
	this.tempsArret = tempsArret;
	this.etat = etat;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getProduction() {
	return production;
}
public void setProduction(String production) {
	this.production = production;
}
public String getFonctionnement() {
	return fonctionnement;
}
public void setFonctionnement(String fonctionnement) {
	this.fonctionnement = fonctionnement;
}
public String getTempsArret() {
	return tempsArret;
}
public void setTempsArret(String tempsArret) {
	this.tempsArret = tempsArret;
}
public String getEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}


}

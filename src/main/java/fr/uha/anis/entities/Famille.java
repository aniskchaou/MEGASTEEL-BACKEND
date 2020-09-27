package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Famille {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String  nom;
private  String familleEntrant;
private String familleSortant;
private String nombreArticle;
private String nombreMachine;

public Famille() {
	// TODO Auto-generated constructor stub
}

public Famille(String nom, String familleEntrant, String familleSortant, String nombreArticle, String nombreMachine) {
	super();
	this.nom = nom;
	this.familleEntrant = familleEntrant;
	this.familleSortant = familleSortant;
	this.nombreArticle = nombreArticle;
	this.nombreMachine = nombreMachine;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getFamilleEntrant() {
	return familleEntrant;
}

public void setFamilleEntrant(String familleEntrant) {
	this.familleEntrant = familleEntrant;
}

public String getFamilleSortant() {
	return familleSortant;
}

public void setFamilleSortant(String familleSortant) {
	this.familleSortant = familleSortant;
}

public String getNombreArticle() {
	return nombreArticle;
}

public void setNombreArticle(String nombreArticle) {
	this.nombreArticle = nombreArticle;
}

public String getNombreMachine() {
	return nombreMachine;
}

public void setNombreMachine(String nombreMachine) {
	this.nombreMachine = nombreMachine;
}




}

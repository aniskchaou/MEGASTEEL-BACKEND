package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Fournisseur {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String codeFournisseur;
private String nom;
private String adresse;
private String tVA;
private String téléphone;
private String responsable;
private String fax;
public Fournisseur() {
	// TODO Auto-generated constructor stub
}
public Fournisseur(String codeFournisseur, String nom, String adresse, String tVA, String téléphone, String responsable,
		String fax) {
	super();
	this.codeFournisseur = codeFournisseur;
	this.nom = nom;
	this.adresse = adresse;
	this.tVA = tVA;
	this.téléphone = téléphone;
	this.responsable = responsable;
	this.fax = fax;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCodeFournisseur() {
	return codeFournisseur;
}
public void setCodeFournisseur(String codeFournisseur) {
	this.codeFournisseur = codeFournisseur;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String gettVA() {
	return tVA;
}
public void settVA(String tVA) {
	this.tVA = tVA;
}
public String getTéléphone() {
	return téléphone;
}
public void setTéléphone(String téléphone) {
	this.téléphone = téléphone;
}
public String getResponsable() {
	return responsable;
}
public void setResponsable(String responsable) {
	this.responsable = responsable;
}
public String getFax() {
	return fax;
}
public void setFax(String fax) {
	this.fax = fax;
}


}

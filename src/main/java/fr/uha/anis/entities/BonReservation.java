package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BonReservation {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
private String codeCommande;
private String codeArticle;
private String codeClient;
private String quantite;
private String date;

public BonReservation() {
	// TODO Auto-generated constructor stub
}

public BonReservation(String codeCommande, String codeArticle, String codeClient, String quantite, String date) {
	super();
	this.codeCommande = codeCommande;
	this.codeArticle = codeArticle;
	this.codeClient = codeClient;
	this.quantite = quantite;
	this.date = date;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getCodeCommande() {
	return codeCommande;
}

public void setCodeCommande(String codeCommande) {
	this.codeCommande = codeCommande;
}

public String getCodeArticle() {
	return codeArticle;
}

public void setCodeArticle(String codeArticle) {
	this.codeArticle = codeArticle;
}

public String getCodeClient() {
	return codeClient;
}

public void setCodeClient(String codeClient) {
	this.codeClient = codeClient;
}

public String getQuantite() {
	return quantite;
}

public void setQuantite(String quantite) {
	this.quantite = quantite;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}


}

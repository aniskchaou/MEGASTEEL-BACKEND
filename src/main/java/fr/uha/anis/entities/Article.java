package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 private String code;
private  String unite;
  private String hauteur;
  private String largeur;
  private String dimension;
  private String poidsUnitaire;
  
  public Article() {
	// TODO Auto-generated constructor stub
}

public Article(String code, String unite, String hauteur, String largeur, String dimension, String poidsUnitaire) {
	super();
	this.code = code;
	this.unite = unite;
	this.hauteur = hauteur;
	this.largeur = largeur;
	this.dimension = dimension;
	this.poidsUnitaire = poidsUnitaire;
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

public String getUnite() {
	return unite;
}

public void setUnite(String unite) {
	this.unite = unite;
}

public String getHauteur() {
	return hauteur;
}

public void setHauteur(String hauteur) {
	this.hauteur = hauteur;
}

public String getLargeur() {
	return largeur;
}

public void setLargeur(String largeur) {
	this.largeur = largeur;
}

public String getDimension() {
	return dimension;
}

public void setDimension(String dimension) {
	this.dimension = dimension;
}

public String getPoidsUnitaire() {
	return poidsUnitaire;
}

public void setPoidsUnitaire(String poidsUnitaire) {
	this.poidsUnitaire = poidsUnitaire;
}
  
}

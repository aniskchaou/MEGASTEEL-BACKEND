package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BonEntreeAchat {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
private String date;
private String quantite;
private String unite;

public BonEntreeAchat() {
	// TODO Auto-generated constructor stub
}

public BonEntreeAchat(String code, String date, String quantite, String unite) {
	super();
	this.code = code;
	this.date = date;
	this.quantite = quantite;
	this.unite = unite;
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

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getQuantite() {
	return quantite;
}

public void setQuantite(String quantite) {
	this.quantite = quantite;
}

public String getUnite() {
	return unite;
}

public void setUnite(String unite) {
	this.unite = unite;
}


}

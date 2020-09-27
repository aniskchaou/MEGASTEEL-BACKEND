package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BonEntreeFabrication {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
    private String codeOF;
    private String quantite;
    private String duree;
    private String date;
    private String unite;
    private String quantiterestante;
    
    public BonEntreeFabrication() {
		// TODO Auto-generated constructor stub
	}

	public BonEntreeFabrication(String code, String codeOF, String quantite, String duree, String date, String unite,
			String quantiterestante) {
		super();
		this.code = code;
		this.codeOF = codeOF;
		this.quantite = quantite;
		this.duree = duree;
		this.date = date;
		this.unite = unite;
		this.quantiterestante = quantiterestante;
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

	public String getCodeOF() {
		return codeOF;
	}

	public void setCodeOF(String codeOF) {
		this.codeOF = codeOF;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

	public String getQuantiterestante() {
		return quantiterestante;
	}

	public void setQuantiterestante(String quantiterestante) {
		this.quantiterestante = quantiterestante;
	}
    
    

}

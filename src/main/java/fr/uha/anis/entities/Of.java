package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Of {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
    private String codeOF;
    private String quantiteRealise;
    private String quantiteRestant;
    private String codeMachine;
    private String articleSortant;
    private String articleEntrant;
    private String etat;
    
    public Of() {
		// TODO Auto-generated constructor stub
	}
    
	public Of(String codeOF, String quantiteRealise, String quantiteRestant, String codemachine, String articlesortant,
			String articleentrant, String etat) {
		super();
		this.codeOF = codeOF;
		this.quantiteRealise = quantiteRealise;
		this.quantiteRestant = quantiteRestant;
		this.codeMachine = codemachine;
		this.articleSortant = articlesortant;
		this.articleEntrant = articleentrant;
		this.etat = etat;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeOF() {
		return codeOF;
	}
	public void setCodeOF(String codeOF) {
		this.codeOF = codeOF;
	}
	public String getQuantiteRealise() {
		return quantiteRealise;
	}
	public void setQuantiteRealise(String quantiteRealise) {
		this.quantiteRealise = quantiteRealise;
	}
	public String getQuantiteRestant() {
		return quantiteRestant;
	}
	public void setQuantiteRestant(String quantiteRestant) {
		this.quantiteRestant = quantiteRestant;
	}
	public String getCodeMachine() {
		return codeMachine;
	}
	public void setCodeMachine(String codemachine) {
		this.codeMachine = codemachine;
	}
	public String getArticleSortant() {
		return articleSortant;
	}
	public void setArticleSortant(String articlesortant) {
		this.articleSortant = articlesortant;
	}
	public String getArticleEntrant() {
		return articleEntrant;
	}
	public void setArticleEntrant(String articleentrant) {
		this.articleEntrant = articleentrant;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
    
    
}

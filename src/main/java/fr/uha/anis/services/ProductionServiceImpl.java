package fr.uha.anis.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uha.anis.dao.ActiviteRepository;
import fr.uha.anis.dao.ArticleRepository;
import fr.uha.anis.dao.BonEntreeAchatRepository;
import fr.uha.anis.dao.BonEntreeFabricationRepository;
import fr.uha.anis.dao.BonLivraisonRepository;
import fr.uha.anis.dao.BonReservationRepository;
import fr.uha.anis.dao.ClientRepository;
import fr.uha.anis.dao.CommandeRepository;
import fr.uha.anis.dao.FamilleRepository;
import fr.uha.anis.dao.FournisseurRepository;
import fr.uha.anis.dao.MachineRepository;
import fr.uha.anis.dao.OfRepository;
import fr.uha.anis.dao.OperateurRepository;
import fr.uha.anis.entities.Activite;
import fr.uha.anis.entities.Article;
import fr.uha.anis.entities.BonEntreeAchat;
import fr.uha.anis.entities.BonEntreeFabrication;
import fr.uha.anis.entities.BonLivraison;
import fr.uha.anis.entities.BonReservation;
import fr.uha.anis.entities.Client;
import fr.uha.anis.entities.Commande;
import fr.uha.anis.entities.Famille;
import fr.uha.anis.entities.Fournisseur;
import fr.uha.anis.entities.Machine;
import fr.uha.anis.entities.Of;
import fr.uha.anis.entities.Operateur;
@Service
@Transactional
public class ProductionServiceImpl {

	@Autowired
	OfRepository ofRepository;
	@Autowired
	ActiviteRepository activiteRepository;
	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	BonEntreeAchatRepository bonEntreeAchatRepository;
	@Autowired
	BonEntreeFabricationRepository bonEntreeFabricationRepository;
	@Autowired
	BonLivraisonRepository bonLivraisonRepository;
	@Autowired
	BonReservationRepository bonReservationRepository;
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	CommandeRepository commandeRepository;
	@Autowired
	FamilleRepository familleRepository;
	@Autowired
	FournisseurRepository fournisseurRepository;
	@Autowired
	MachineRepository machineRepository;
	@Autowired
	OperateurRepository operateurRepository;
	
	
	
	
	
	
	
	
	
	public void initOf()
	{
							
		ofRepository.save(new Of("74DC", "11", "23", "ED3VS"	, "213E", "3D44", "Démarré"));
	}
	
	public void initActivite()
	{
		activiteRepository.save(new Activite("Laminage", "Spirale", "Spirale", "1000", "7"));
	}
	
	public void initArticle()
	{
							
		articleRepository.save(new Article("2EZS", "U", "1341", "1920", "23", "5.2"));
	}
	
	public void initBonEntreeAchat()
	{			
		bonEntreeAchatRepository.save(new BonEntreeAchat("2ED2ZS", "21/07/2018", "22", "Kg"));
	}
	
	public void initBonEntreeFacrication()
	{
						
		bonEntreeFabricationRepository.save(new BonEntreeFabrication("7RVT", "7HVRY", "103", "5", "11/09/2017", "U", "15"));
	}
	
	public void initBonLivraison()
	{
						
		bonLivraisonRepository.save(new BonLivraison("2ED4Z2", "3D3D", "3D4F4", "5", "23/06/2017"));
	}
	
	public void initReservation()
	{
		bonReservationRepository.save(new BonReservation("2ED4Z2", "3D3D", "3D4F4", "5", "23/06/2017"));
	}
	
	public void initClient()
	{
							
		clientRepository.save(new Client("2ED4Z2", "25", "rue de sfax 3000", "74 454 989", "73 454 222", "contact@gmail.com"));
	}
	
	public void initCommande()
	{
					
		commandeRepository.save(new Commande("7RVT", "12/11/2017", "01/03/2018", "Planifiée"));
	}
	
	public void initFamille()
	{
						
		familleRepository.save(new Famille("Fil machine", "Fil machine", "Fil machine", "38", "8"));
	}
	
	public void initFournisseur()
	{
						
		fournisseurRepository.save(new Fournisseur("8RDV4", "Ferriere Nord Pittini", "Italie", "", "+39 67 74 44 00	", "Elena Contardo	", "+39 67 74 44 00"));
	}
	
	public void initMachine()
	{
						
		machineRepository.save(new Machine("2EDCRT", "1994", "5", "7", "Active"));
	}
	
	public void initOperateur()
	{
							
		operateurRepository.save(new Operateur("09TGR", "Mohamed", "Ben mohamed", "75 234 343", "mohamed@gmail.com", "Active"));
	}
}

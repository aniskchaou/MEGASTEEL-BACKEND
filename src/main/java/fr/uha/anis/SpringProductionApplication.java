package fr.uha.anis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import fr.uha.anis.entities.Of;
import fr.uha.anis.entities.Operateur;
import fr.uha.anis.services.ProductionServiceImpl;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringProductionApplication implements CommandLineRunner{

	@Autowired
	ProductionServiceImpl productionService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//restConfiguration.exposeIdsFor(Operateur.class);
		productionService.initOf();
		productionService.initActivite();
		productionService.initArticle();
		productionService.initBonEntreeAchat();
		productionService.initBonEntreeFacrication();
		productionService.initBonLivraison();
		productionService.initReservation();
		productionService.initClient();
		productionService.initCommande();
		productionService.initFamille();
		productionService.initFournisseur();
		productionService.initFamille();
		productionService.initOperateur();
		productionService.initMachine();
		
		
	}

}

package fr.uha.anis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.uha.anis.entities.Fournisseur;
import fr.uha.anis.entities.Of;

@Repository
public interface FournisseurRepository extends CrudRepository<Fournisseur,Long>{
	Fournisseur getById(Long id);
}

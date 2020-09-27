package fr.uha.anis.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.uha.anis.dao.BonLivraisonRepository;
import fr.uha.anis.entities.BonLivraison;
@RestController
@RequestMapping("/bonlivraison")
@CrossOrigin

public class BonLivraisonController {

	@Autowired
	BonLivraisonRepository bonLivraisonRepository;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> create(@Validated @RequestBody BonLivraison bonLivraison, BindingResult result){

	        if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }

	        BonLivraison newOF = bonLivraisonRepository.save(bonLivraison);

	        return new ResponseEntity<BonLivraison>(newOF, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<BonLivraison> getAll()
   {
	   return bonLivraisonRepository.findAll();
   }
   
   @GetMapping("/{t_id}")
   public ResponseEntity<BonLivraison> getTaskById(@PathVariable Long t_id)
   {
	   BonLivraison task=bonLivraisonRepository.getById(t_id);
	   return new ResponseEntity<BonLivraison>(task,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{t_id}")
   public ResponseEntity<String> delete(@PathVariable Long t_id)
   {
	   bonLivraisonRepository.deleteById(t_id);
	   return new ResponseEntity<String>("task was deleted",HttpStatus.OK);
   }
}

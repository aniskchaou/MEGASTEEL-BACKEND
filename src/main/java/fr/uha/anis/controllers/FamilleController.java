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

import fr.uha.anis.dao.FamilleRepository;
import fr.uha.anis.entities.Famille;
@RestController
@RequestMapping("/famille")
@CrossOrigin

public class FamilleController {

	@Autowired
	FamilleRepository familleRepository;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> create(@Validated @RequestBody Famille famille, BindingResult result){

	        if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }

	        Famille newOF = familleRepository.save(famille);

	        return new ResponseEntity<Famille>(newOF, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Famille> getAll()
   {
	   return familleRepository.findAll();
   }
   
   @GetMapping("/{t_id}")
   public ResponseEntity<Famille> getTaskById(@PathVariable Long t_id)
   {
	   Famille task=familleRepository.getById(t_id);
	   return new ResponseEntity<Famille>(task,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{t_id}")
   public ResponseEntity<String> delete(@PathVariable Long t_id)
   {
	   familleRepository.deleteById(t_id);
	   return new ResponseEntity<String>("task was deleted",HttpStatus.OK);
   }
}

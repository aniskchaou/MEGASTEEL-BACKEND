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

import fr.uha.anis.dao.BonEntreeAchatRepository;
import fr.uha.anis.entities.BonEntreeAchat;
@RestController
@RequestMapping("/bonentreeachat")
@CrossOrigin

public class BonEntreeAchatController {

	@Autowired
	BonEntreeAchatRepository bonEntreeAchatRepository;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> create(@Validated @RequestBody BonEntreeAchat bonEntreeAchat, BindingResult result){

	        if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }

	        BonEntreeAchat newOF = bonEntreeAchatRepository.save(bonEntreeAchat);

	        return new ResponseEntity<BonEntreeAchat>(newOF, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<BonEntreeAchat> getAll()
   {
	   return bonEntreeAchatRepository.findAll();
   }
   
   @GetMapping("/{t_id}")
   public ResponseEntity<BonEntreeAchat> getTaskById(@PathVariable Long t_id)
   {
	   BonEntreeAchat task=bonEntreeAchatRepository.getById(t_id);
	   return new ResponseEntity<BonEntreeAchat>(task,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{t_id}")
   public ResponseEntity<String> delete(@PathVariable Long t_id)
   {
	   bonEntreeAchatRepository.deleteById(t_id);
	   return new ResponseEntity<String>("task was deleted",HttpStatus.OK);
   }
}

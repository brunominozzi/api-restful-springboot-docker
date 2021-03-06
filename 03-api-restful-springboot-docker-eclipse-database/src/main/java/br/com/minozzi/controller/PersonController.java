package br.com.minozzi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.minozzi.data.vo.PersonVO;
import br.com.minozzi.data.vo.v2.PersonVOv2;
import br.com.minozzi.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@GetMapping
	public List<PersonVO> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public PersonVO findById(@PathVariable(value="id") Long id){
		return service.findById(id);
	}

	@PostMapping
	public PersonVO create(@RequestBody PersonVO person){
		return service.create(person);
	}
	
	@PostMapping("/v2")
	public PersonVOv2 createV2(@RequestBody PersonVOv2 person){
		return service.createV2(person);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public PersonVO update(@RequestBody PersonVO person){
		return service.update(person);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable(value="id") Long id){
		service.delete(id); 
		return ResponseEntity.ok().build();
	}
}

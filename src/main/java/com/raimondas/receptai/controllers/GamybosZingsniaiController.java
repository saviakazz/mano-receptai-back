package com.raimondas.receptai.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raimondas.receptai.entities.GamybosZingsniai;
import com.raimondas.receptai.repositories.GamybosZingsniaiRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class GamybosZingsniaiController {

	private GamybosZingsniaiRepository repository;
	
	GamybosZingsniaiController(GamybosZingsniaiRepository repository){
		this.repository = repository;
	}
	
	@RequestMapping(value = "/gamybos_zingsniai/{receptoID}", method = RequestMethod.GET)
	public List<GamybosZingsniai>getGamybosZingsniai(@PathVariable("receptoID") int receptoID){
		List<GamybosZingsniai> gamybosZingsniai = repository.findByReceptoID(receptoID);
		return gamybosZingsniai;
	}
	
	@RequestMapping(value="/gamybos_zingsnis", method=RequestMethod.PUT)
	public GamybosZingsniai saveGamybosZingsnis(@RequestBody GamybosZingsniai gamybosZingsnis) {
		return repository.save(gamybosZingsnis);
		
	}
	
	@RequestMapping(value="/gamybos_zingsnis/{id}", method=RequestMethod.DELETE)
	public void deleteGamybosZingsnis(@PathVariable("id") int id) {
		GamybosZingsniai g = repository.findById(id).get();
		repository.delete(g);
	}
	
}

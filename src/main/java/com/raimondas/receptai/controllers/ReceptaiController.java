package com.raimondas.receptai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raimondas.receptai.entities.Receptai;
import com.raimondas.receptai.repositories.ReceptaiRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ReceptaiController {

	private ReceptaiRepository receptaiRepository;

	@Autowired
	ReceptaiController(ReceptaiRepository receptaiRepository) {
		this.receptaiRepository = receptaiRepository;
	}

	@RequestMapping(value="/receptai", method=RequestMethod.GET)
	public List<Receptai> getReceptai() {
		return (List<Receptai>) receptaiRepository.findAll();
	}
	
	@RequestMapping(value="/receptas/{id}", method=RequestMethod.GET)
	public Receptai getReceptas(@PathVariable("id") int id) {
		return receptaiRepository.findById(id).get();
	}
	
	@RequestMapping(value="/receptas/{id}", method=RequestMethod.PUT)
	public Receptai saveReceptas(@RequestBody Receptai receptas) {
		return receptaiRepository.save(receptas);
	}	
	
	@RequestMapping(value="/receptas/{id}", method=RequestMethod.DELETE)
	public String deleteReceptas(@PathVariable("id") int id) {
		Receptai r = receptaiRepository.findById(id).get();
		receptaiRepository.delete(r);
		return "Deleted successfully";
	}

	
}

package com.raimondas.receptai.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raimondas.receptai.entities.MatavimoVienetai;
import com.raimondas.receptai.repositories.MatavimoVienetaiRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MatavimoVienetaiController {
	
	private MatavimoVienetaiRepository repository;
	
	MatavimoVienetaiController(MatavimoVienetaiRepository repository){
		this.repository = repository;
	}
	
	@RequestMapping(value = "/matavimo_vienetai", method = RequestMethod.GET)
	public List<MatavimoVienetai>getMatavimoVienetai(){
		return (List<MatavimoVienetai>)repository.findAll();
	}
}

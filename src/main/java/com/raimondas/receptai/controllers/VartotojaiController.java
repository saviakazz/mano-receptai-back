package com.raimondas.receptai.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raimondas.receptai.entities.Vartotojai;
import com.raimondas.receptai.repositories.VartotojaiRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VartotojaiController {
	
	private VartotojaiRepository repository;
	
	VartotojaiController (VartotojaiRepository repository){
		this.repository = repository;
	}
	
	@RequestMapping(value = "/vartotojai/{email}", method = RequestMethod.GET)
	public Vartotojai getVartotojai(@PathVariable("email") String email){
		List<Vartotojai> vartotojuSarasas = repository.findByEmail(email);
		if (vartotojuSarasas.size() > 0){
			return (Vartotojai)vartotojuSarasas.get(0);
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="/vartotojas", method=RequestMethod.PUT)
	public void saveVartotojas(@RequestBody Vartotojai vartotojas) {
		repository.save(vartotojas);
	}
	
}

package com.raimondas.receptai.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raimondas.receptai.dto.IngredientasRequest;
import com.raimondas.receptai.entities.Ingredientai;
import com.raimondas.receptai.entities.MatavimoVienetai;
import com.raimondas.receptai.repositories.IngredientaiRepository;
import com.raimondas.receptai.repositories.MatavimoVienetaiRepository;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class IngredientaiController {
	private IngredientaiRepository repository;
	private MatavimoVienetaiRepository matavimoVienetaiRepository;
	
	IngredientaiController(IngredientaiRepository repository, MatavimoVienetaiRepository matavimoVienetaiRepository){
		this.repository = repository;
		this.matavimoVienetaiRepository = matavimoVienetaiRepository;
	}
	
	@RequestMapping(value = "/ingredientai/{receptoID}", method = RequestMethod.GET)
	public List<Ingredientai>getIngredientai(@PathVariable("receptoID") int receptoID){
		List<Ingredientai> ingredientai = repository.findByReceptoID(receptoID);
		return ingredientai;
	}	

	@RequestMapping(value="/ingredientas", method=RequestMethod.PUT)
	public Ingredientai saveIngredientas(@RequestBody IngredientasRequest request) {
		
		MatavimoVienetai matavimoVienetas;
		if (request.getMatavimoVienetoID() != 0) {
			matavimoVienetas = matavimoVienetaiRepository.findById(request.getMatavimoVienetoID()).get();
		}else {
			matavimoVienetas = null;
		}
		
		
		Ingredientai ingredientas = new Ingredientai();
		ingredientas.setIngredientas(request.getIngredientas());
		ingredientas.setIngredientoID(request.getIngredientoID());
		ingredientas.setKiekis(request.getKiekis());
		ingredientas.setMatavimoVienetas(matavimoVienetas);
		ingredientas.setReceptoID(request.getReceptoID());
		
		return repository.save(ingredientas);
	}
	
	@RequestMapping(value="/ingredientas/{id}", method=RequestMethod.DELETE)
	public void deleteIngredientas(@PathVariable("id") int id) {
		Ingredientai i = repository.findById(id).get();
		repository.delete(i);
	}
	
	
}

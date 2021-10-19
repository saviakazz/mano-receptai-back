package com.raimondas.receptai.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.raimondas.receptai.entities.Ingredientai;

public interface IngredientaiRepository extends CrudRepository<Ingredientai, Integer> {
	List <Ingredientai> findByReceptoID(int receptoID);
}
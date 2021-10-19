package com.raimondas.receptai.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.raimondas.receptai.entities.GamybosZingsniai;
import com.raimondas.receptai.entities.Ingredientai;

public interface GamybosZingsniaiRepository extends CrudRepository<GamybosZingsniai, Integer> {
	List <GamybosZingsniai> findByReceptoID(int receptoID);
}

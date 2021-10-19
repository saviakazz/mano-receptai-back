package com.raimondas.receptai.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.raimondas.receptai.entities.Vartotojai;

public interface VartotojaiRepository extends CrudRepository<Vartotojai, Integer> {
	List <Vartotojai> findByEmail(String email);
}

package com.raimondas.receptai;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raimondas.receptai.entities.Ingredientai;
import com.raimondas.receptai.entities.Receptai;
import com.raimondas.receptai.repositories.IngredientaiRepository;
import com.raimondas.receptai.repositories.ReceptaiRepository;

@SpringBootTest
class ReceptaiApplicationTests {
	
	@Autowired
	private ReceptaiRepository receptaiRepo;
	
	@Autowired
	private IngredientaiRepository ingredientaiRepo;

//	@Test
//	void testCreateReceptas() {
//		Receptai receptas = new Receptai();
//		receptas.setPavadinimas("Mielinė tešla");
//		receptas.setAprasymas("Puiki mielinė tešla, kuri tiks tiek picos padui, tiek bandelėms.");
//		receptaiRepo.save(receptas);
//	}
	
//	@Test
//	void  testFindAllReceptai() {
//		System.out.println((List<Receptai>) receptaiRepo.findAll());
//	}
	
	@Test
	void findIngredientaiByReceptoID() {
		System.out.println((List<Ingredientai>) ingredientaiRepo.findByReceptoID(1));
	}

}

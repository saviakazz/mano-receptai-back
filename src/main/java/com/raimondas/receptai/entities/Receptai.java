package com.raimondas.receptai.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "RECEPTAI")
public class Receptai {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RECEPTO_ID")
	private int receptoID;
	private String pavadinimas;
	private String aprasymas;
	@Column(name = "PAVEIKSLELIO_NUORODA")
	private String paveikslelioNuoroda;

	public int getReceptoID() {
		return receptoID;
	}

	public void setReceptoID(int receptoID) {
		this.receptoID = receptoID;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public String getAprasymas() {
		return aprasymas;
	}

	public void setAprasymas(String aprasymas) {
		this.aprasymas = aprasymas;
	}

	public String getPaveikslelioNuoroda() {
		return paveikslelioNuoroda;
	}

	public void setPaveikslelioNuoroda(String paveikslelioNuoroda) {
		this.paveikslelioNuoroda = paveikslelioNuoroda;
	}

	@Override
	public String toString() {
		return pavadinimas;
	}

}

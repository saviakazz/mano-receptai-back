package com.raimondas.receptai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "INGREDIENTAI")
public class Ingredientai {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "INGREDIENTO_ID")
	private int ingredientoID;
	private String ingredientas;
	private Double kiekis;
	
	@Column(name = "RECEPTO_ID")
	private int receptoID;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "RECEPTO_ID", nullable = false)
//	@JsonIgnore
//	private Receptai receptas;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MATAVIMO_VIENETO_ID", nullable = true)
	private MatavimoVienetai matavimoVienetas;	
		
	public int getIngredientoID() {
		return ingredientoID;
	}

	public void setIngredientoID(int ingredientoID) {
		this.ingredientoID = ingredientoID;
	}

	public String getIngredientas() {
		return ingredientas;
	}

	public void setIngredientas(String ingredientas) {
		this.ingredientas = ingredientas;
	}

	public Double getKiekis() {
		return kiekis;
	}

	public void setKiekis(Double kiekis) {
		this.kiekis = kiekis;
	}

	public MatavimoVienetai getMatavimoVienetas() {
		return matavimoVienetas;
	}

	public void setMatavimoVienetas(MatavimoVienetai matavimoVienetas) {
		this.matavimoVienetas = matavimoVienetas;
	}

	public int getReceptoID() {
		return receptoID;
	}

	public void setReceptoID(int receptoID) {
		this.receptoID = receptoID;
	}


}

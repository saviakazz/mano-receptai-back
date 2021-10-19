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
@Table(name = "MATAVIMO_VIENETAI")
public class MatavimoVienetai {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MATAVIMO_VIENETO_ID")
	private int matavimoVienetoID;
	@Column(name = "MATAVIMO_VIENETAS")
	private String matavimoVienetas;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "matavimoVienetas")
	@JsonIgnore
	private List<Ingredientai> ingredientas;

	public int getMatavimoVienetoID() {
		return matavimoVienetoID;
	}

	public void setMatavimoVienetoID(int matavimoVienetoID) {
		this.matavimoVienetoID = matavimoVienetoID;
	}

	public String getMatavimoVienetas() {
		return matavimoVienetas;
	}

	public void setMatavimoVienetas(String matavimoVienetas) {
		this.matavimoVienetas = matavimoVienetas;
	}

	public List<Ingredientai> getIngredientas() {
		return ingredientas;
	}

	public void setIngredientas(List<Ingredientai> ingredientas) {
		this.ingredientas = ingredientas;
	}

}

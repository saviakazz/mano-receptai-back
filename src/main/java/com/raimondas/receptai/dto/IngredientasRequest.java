package com.raimondas.receptai.dto;

public class IngredientasRequest {
	private int ingredientoID;
	private String ingredientas;
	private Double kiekis;
	private int matavimoVienetoID;
	private int receptoID;
	
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
	public int getMatavimoVienetoID() {
		return matavimoVienetoID;
	}
	public void setMatavimoVienetoID(int matavimoVienetoID) {
		this.matavimoVienetoID = matavimoVienetoID;
	}
	public int getIngredientoID() {
		return ingredientoID;
	}
	public void setIngredientoID(int ingredientoID) {
		this.ingredientoID = ingredientoID;
	}
	public int getReceptoID() {
		return receptoID;
	}
	public void setReceptoID(int receptoID) {
		this.receptoID = receptoID;
	}
}

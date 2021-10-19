package com.raimondas.receptai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VARTOTOJAI")
public class Vartotojai {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VARTOTOJO_ID")
	private int vartotojoID;
	private String email;
	private String slaptazodis;
	
	public int getVartotojoID() {
		return vartotojoID;
	}
	public void setVartotojoID(int vartotojoID) {
		this.vartotojoID = vartotojoID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSlaptazodis() {
		return slaptazodis;
	}
	public void setSlaptazodis(String slaptazodis) {
		this.slaptazodis = slaptazodis;
	}
}

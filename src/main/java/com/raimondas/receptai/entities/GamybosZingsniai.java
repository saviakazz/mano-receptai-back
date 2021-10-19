package com.raimondas.receptai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "GAMYBOS_ZINGSNIAI")
public class GamybosZingsniai {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GAMYBOS_EIGOS_ID")
	private int gamybosID;
	@Column(name = "ZINGSNIO_NUMERIS")
	private Integer zingsnioNumeris;
	private String zingsnis;

	@Column(name = "RECEPTO_ID")
	private int receptoID;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "RECEPTO_ID", nullable = false)
//	@JsonIgnore
//	private Receptai receptas;

	public int getGamybosID() {
		return gamybosID;
	}

	public void setGamybosID(int gamybosID) {
		this.gamybosID = gamybosID;
	}

	public Integer getZingsnioNumeris() {
		return zingsnioNumeris;
	}

	public void setZingsnioNumeris(Integer zingsnioNumeris) {
		this.zingsnioNumeris = zingsnioNumeris;
	}

	public String getZingsnis() {
		return zingsnis;
	}

	public void setZingsnis(String zingsnis) {
		this.zingsnis = zingsnis;
	}

	public int getReceptoID() {
		return receptoID;
	}

	public void setReceptoID(int receptoID) {
		this.receptoID = receptoID;
	}

//	public Receptai getReceptas() {
//		return receptas;
//	}
//
//	public void setReceptas(Receptai receptas) {
//		this.receptas = receptas;
//	}

}

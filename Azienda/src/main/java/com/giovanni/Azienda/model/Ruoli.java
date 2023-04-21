package com.giovanni.Azienda.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Ruoli implements Serializable{

	private static final long serialVersionUID = 8193301236316349328L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id_r")
	private int idR;
	
	@Column
	private String nome;
	
	@Column
	private String descrizione;
	
	@OneToMany(mappedBy = "ruoliImp", cascade = CascadeType.ALL)
	private Set<Impiegati> ruoliImp = new HashSet<Impiegati>();


	public Set<Impiegati> getRuoliImp() {
		return ruoliImp;
	}

	public void setRuoliImp(Set<Impiegati> ruoliImp) {
		this.ruoliImp = ruoliImp;
	}

	public long getIdR() {
		return idR;
	}

	public void setIdR(int idR) {
		this.idR = idR;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}

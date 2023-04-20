package com.giovanni.Azienda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Ruoli implements Serializable{

	private static final long serialVersionUID = 8193301236316349328L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id_ruoli;
	
	@Column
	private String nome;
	
	@Column
	private String descrizione;

	public long getId_ruoli() {
		return id_ruoli;
	}

	public void setId_ruoli(long id_ruoli) {
		this.id_ruoli = id_ruoli;
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

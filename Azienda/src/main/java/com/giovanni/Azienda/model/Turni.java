package com.giovanni.Azienda.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Turni implements Serializable{
	private static final long serialVersionUID = -5778781470858314406L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idT;
	
	@Column
	private String nome;
	
	@Column
	private LocalTime data_inizio;
	
	@Column
	private LocalTime data_fine;

	public int getIdT() {
		return idT;
	}

	public void setIdT(int idT) {
		this.idT = idT;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData_inizio() {
		return data_inizio;
	}

	public void setData_inizio(LocalDate data_inizio) {
		this.data_inizio = data_inizio;
	}

	public LocalDate getData_fine() {
		return data_fine;
	}

	public void setData_fine(LocalDate data_fine) {
		this.data_fine = data_fine;
	}
	
	
}

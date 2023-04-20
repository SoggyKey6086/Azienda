package com.giovanni.Azienda.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Presenze implements Serializable {
	private static final long serialVersionUID = 4256094607960615357L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPre;
	
	@Column 
	private LocalDate data;
	
	@Column
	private LocalTime orario_inizio;
	
	@Column 
	private LocalTime orario_fine;
	
	@ManyToOne
	@JoinColumn(name="id_imp", nullable = false)
	private Impiegati impiegati;
	
	

	public Long getIdPre() {
		return idPre;
	}

	public void setIdPre(Long idPre) {
		this.idPre = idPre;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getOrario_inizio() {
		return orario_inizio;
	}

	public void setOrario_inizio(LocalTime orario_inizio) {
		this.orario_inizio = orario_inizio;
	}

	public LocalTime getOrario_fine() {
		return orario_fine;
	}

	public void setOrario_fine(LocalTime orario_fine) {
		this.orario_fine = orario_fine;
	}

	public Impiegati getImpiegati() {
		return impiegati;
	}

	public void setImpiegati(Impiegati impiegati) {
		this.impiegati = impiegati;
	} 
	
}

package com.giovanni.Azienda.model;

import java.io.Serializable;
import java.time.LocalDate;

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
public class Ferie implements Serializable {
	private static final long serialVersionUID = 8687342422733663082L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idF;

	@Column(nullable = false)
	private LocalDate dataInizioFerie;

	@Column(nullable = false)
	private LocalDate dataFineFerie;

	@ManyToOne
	@JoinColumn(name = "id_ferie", nullable = false)
	private Impiegati impiegatoF;

	public long getIdF() {
		return idF;
	}

	public void setIdF(long idF) {
		this.idF = idF;
	}

	public LocalDate getDataInizioFerie() {
		return dataInizioFerie;
	}

	public void setDataInizioFerie(LocalDate dataInizioFerie) {
		this.dataInizioFerie = dataInizioFerie;
	}

	public LocalDate getDataFineFerie() {
		return dataFineFerie;
	}

	public void setDataFineFerie(LocalDate dataFineFerie) {
		this.dataFineFerie = dataFineFerie;
	}

	public Impiegati getImpiegatoF() {
		return impiegatoF;
	}

	public void setImpiegatoF(Impiegati impiegatoF) {
		this.impiegatoF = impiegatoF;
	}

}

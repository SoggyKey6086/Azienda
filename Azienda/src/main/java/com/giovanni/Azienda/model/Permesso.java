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
public class Permesso implements Serializable{

	private static final long serialVersionUID = 6455236305421883769L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPer;
	
	@Column
	private LocalDate data_inizio;
	
	@Column
	private LocalDate data_fine;
	
	@Column
	private String motivo;
	
	@ManyToOne
	@JoinColumn(name="id_imp", nullable=false)
	private Impiegati impiegatoPer;

	public int getIdPer() {
		return idPer;
	}

	public void setIdPer(int idPer) {
		this.idPer = idPer;
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

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Impiegati getImpiegatoPer() {
		return impiegatoPer;
	}

	public void setImpiegatoPer(Impiegati impiegatoPer) {
		this.impiegatoPer = impiegatoPer;
	}



	
	
	
}

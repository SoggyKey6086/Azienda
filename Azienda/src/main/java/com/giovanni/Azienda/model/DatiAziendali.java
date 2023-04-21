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
public class DatiAziendali implements Serializable{
	private static final long serialVersionUID = 6054072049247454700L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idDA;

	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private LocalDate data_nascita;
	
	@Column(nullable = false)
	private LocalDate data_assunzione;
	
	@Column(nullable = false)
	private float salario;
	
	@ManyToOne
	@JoinColumn(name="id_rep", nullable=false)
	private Reparti reparto;

	public long getIdDA() {
		return idDA;
	}

	public void setIdDA(long idDA) {
		this.idDA = idDA;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getData_nascita() {
		return data_nascita;
	}

	public void setData_nascita(LocalDate data_nascita) {
		this.data_nascita = data_nascita;
	}

	public LocalDate getData_assunzione() {
		return data_assunzione;
	}

	public void setData_assunzione(LocalDate data_assunzione) {
		this.data_assunzione = data_assunzione;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Reparti getReparto() {
		return reparto;
	}

	public void setReparto(Reparti reparto) {
		this.reparto = reparto;
	}
}

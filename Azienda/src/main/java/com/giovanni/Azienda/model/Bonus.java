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
public class Bonus implements Serializable {
	private static final long serialVersionUID = 6862614154787153120L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idB;

	@Column(nullable = false)
	private LocalDate data;

	@Column(nullable = false)
	private float importo;

	@ManyToOne
	@JoinColumn(name = "id_bonus", nullable = false)
	private Impiegati impiegatoB;

	public int getIdB() {
		return idB;
	}

	public void setIdB(int idB) {
		this.idB = idB;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public float getImporto() {
		return importo;
	}

	public void setImporto(float importo) {
		this.importo = importo;
	}

	public Impiegati getImpiegatoB() {
		return impiegatoB;
	}

	public void setImpiegatoB(Impiegati impiegatoB) {
		this.impiegatoB = impiegatoB;
	}

}

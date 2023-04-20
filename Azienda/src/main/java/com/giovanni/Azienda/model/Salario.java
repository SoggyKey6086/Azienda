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
public class Salario implements Serializable {
	private static final long serialVersionUID = 8745969441772636343L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idS;

	@Column(nullable = false)
	private LocalDate data;

	@Column(nullable = false)
	private float importo;

	@ManyToOne
	@JoinColumn(name = "id_salario", nullable = false)
	private Impiegati impiegatoS;

	public int getIdS() {
		return idS;
	}

	public void setIdS(int idS) {
		this.idS = idS;
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

	public Impiegati getImpiegatoS() {
		return impiegatoS;
	}

	public void setImpiegatoS(Impiegati impiegatoS) {
		this.impiegatoS = impiegatoS;
	}

}

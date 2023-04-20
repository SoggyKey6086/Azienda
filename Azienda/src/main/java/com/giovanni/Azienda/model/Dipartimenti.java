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
public class Dipartimenti implements Serializable {
	private static final long serialVersionUID = -5677868630895730332L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdDip;
    
    @Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String descrizione;
	

	public int getIdDip() {
		return IdDip;
	}

	public void setIdDip(int idDip) {
		IdDip = idDip;
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

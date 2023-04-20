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
public class Reparti implements Serializable{
	private static final long serialVersionUID = 6730806279574944112L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRep;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String descrizione;
	
	@OneToMany(mappedBy = "reparto",cascade = CascadeType.ALL)
	private Set<DatiAziendali> da = new HashSet<DatiAziendali>();
	
	
	public int getIdRep() {
		return idRep;
	}

	public void setIdRep(int idRep) {
		this.idRep = idRep;
	}

	public Set<DatiAziendali> getDa() {
		return da;
	}

	public void setDa(Set<DatiAziendali> da) {
		this.da = da;
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

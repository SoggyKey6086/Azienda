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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Impiegati implements Serializable {
	private static final long serialVersionUID = -1821041931068958512L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_imp")
	private int idImp;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String cognome;

	@Column(nullable = false)
	private String citta;

	@Column(nullable = false)
	private String cap;

	@OneToMany(mappedBy = "impiegatoF", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Ferie> ferie = new HashSet<Ferie>();

	@OneToMany(mappedBy = "impiegatoPer", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Permesso> permesso = new HashSet<Permesso>();

	@OneToMany(mappedBy = "impiegatoPre", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Presenze> presenza = new HashSet<Presenze>();

	@OneToMany(mappedBy = "impiegatoS", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Salario> salario = new HashSet<Salario>();

	@OneToMany(mappedBy = "impiegatoB", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Bonus> bonus = new HashSet<Bonus>();
	
	@ManyToOne
	@JoinColumn(name = "id_rep", nullable = false)
	private Reparti repartiImp;

	
	public Reparti getRepartiImp() {
		return repartiImp;
	}

	public void setRepartiImp(Reparti repartiImp) {
		this.repartiImp = repartiImp;
	}

	public Set<Permesso> getPermesso() {
		return permesso;
	}

	public void setPermesso(Set<Permesso> permesso) {
		this.permesso = permesso;
	}

	public Set<Presenze> getPresenza() {
		return presenza;
	}

	public void setPresenza(Set<Presenze> presenza) {
		this.presenza = presenza;
	}

	public Set<Salario> getSalario() {
		return salario;
	}

	public void setSalario(Set<Salario> salario) {
		this.salario = salario;
	}

	public Set<Bonus> getBonus() {
		return bonus;
	}

	public void setBonus(Set<Bonus> bonus) {
		this.bonus = bonus;
	}

	public Set<Ferie> getFerie() {
		return ferie;
	}

	public void setFerie(Set<Ferie> ferie) {
		this.ferie = ferie;
	}

	public int getIdImp() {
		return idImp;
	}

	public void setIdImp(int idImp) {
		this.idImp = idImp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

}

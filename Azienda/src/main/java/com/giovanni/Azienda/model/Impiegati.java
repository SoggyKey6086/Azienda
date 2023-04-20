package com.giovanni.Azienda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Impiegati implements Serializable{
	private static final long serialVersionUID = -1821041931068958512L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idImp;
	
	@Column(nullable = false)
	private String marca;

	
	
}

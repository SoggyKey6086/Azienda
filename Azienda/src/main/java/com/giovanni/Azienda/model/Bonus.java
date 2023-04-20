package com.giovanni.Azienda.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Bonus implements Serializable{
	private static final long serialVersionUID = 6862614154787153120L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idB;
	
}

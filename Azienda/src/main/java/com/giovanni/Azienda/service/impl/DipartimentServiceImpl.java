package com.giovanni.Azienda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.giovanni.Azienda.model.Dipartimenti;
import com.giovanni.Azienda.repository.DipartimentiRepository;
import com.giovanni.Azienda.service.DipartimentiService;

public class DipartimentServiceImpl implements DipartimentiService{

	@Autowired
	DipartimentiRepository dr;
	
	@Override
	public void saveDipartimenti(Dipartimenti Dipartimenti) {
		dr.save(Dipartimenti);
		
	}

	@Override
	public List<Dipartimenti> getAll() {
		return dr.findAll();
	}

	@Override
	public Optional<Dipartimenti> findById(int id) {
		
		return dr.findById(id);
	}

	@Override
	public void deleteDipartimenti(Dipartimenti Dipartimenti) {
		dr.delete(Dipartimenti);
	}

	@Override
	public Optional<Dipartimenti> findQtaImpXImp(int idDip) {
		return dr.findQtaImpXImp(idDip);
	}

}

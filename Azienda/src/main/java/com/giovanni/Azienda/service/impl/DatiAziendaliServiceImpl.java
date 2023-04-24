package com.giovanni.Azienda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanni.Azienda.model.DatiAziendali;
import com.giovanni.Azienda.repository.DatiAziendaliRepository;
import com.giovanni.Azienda.service.DatiAziendaliService;

@Service
public class DatiAziendaliServiceImpl implements DatiAziendaliService {

	@Autowired
	DatiAziendaliRepository dr;

	@Override
	public void saveDatiAziendali(DatiAziendali datiAziendali) {
		dr.save(datiAziendali);
	}

	@Override
	public List<DatiAziendali> getAll() {

		return dr.findAll();
	}

	@Override
	public Optional<DatiAziendali> findById(long id) {

		return dr.findById(id);
	}

	@Override
	public void deleteDatiAziendali(DatiAziendali datiAziendali) {
		dr.delete(datiAziendali);
	}
}

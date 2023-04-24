package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.giovanni.Azienda.model.DatiAziendali;

@Service
public interface DatiAziendaliService {
	
	void saveDatiAziendali(DatiAziendali datiAziendali);
	List<DatiAziendali> getAll();
	Optional<DatiAziendali> findById(long id);
	void deleteDatiAziendali(DatiAziendali datiAziendali);

}

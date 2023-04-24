package com.giovanni.Azienda.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giovanni.Azienda.service.BonusService;
import com.giovanni.Azienda.service.DatiAziendaliService;
import com.giovanni.Azienda.service.DipartimentiService;
import com.giovanni.Azienda.service.FerieService;
import com.giovanni.Azienda.service.ImpiegatiService;
import com.giovanni.Azienda.service.PermessoService;
import com.giovanni.Azienda.service.PresenzeService;
import com.giovanni.Azienda.service.RepartiService;
import com.giovanni.Azienda.service.RuoliService;
import com.giovanni.Azienda.service.SalariService;
import com.giovanni.Azienda.service.TurniService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "")
public class RestControllerGen {

	@Autowired
	BonusService bs;
	@Autowired
	DatiAziendaliService da;
	@Autowired
	DipartimentiService ds;
	@Autowired
	FerieService fs;
	@Autowired
	ImpiegatiService is;
	@Autowired
	PermessoService pers;
	@Autowired
	PresenzeService pres;
	@Autowired
	RepartiService reps;
	@Autowired
	RuoliService ruos;
	@Autowired
	SalariService ss;
	@Autowired
	TurniService ts;
}

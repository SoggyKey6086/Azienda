package com.giovanni.Azienda.restcontroller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giovanni.Azienda.model.Bonus;
import com.giovanni.Azienda.model.DatiAziendali;
import com.giovanni.Azienda.model.Dipartimenti;
import com.giovanni.Azienda.model.Ferie;
import com.giovanni.Azienda.model.Impiegati;
import com.giovanni.Azienda.model.Permesso;
import com.giovanni.Azienda.model.Presenze;
import com.giovanni.Azienda.model.Reparti;
import com.giovanni.Azienda.model.Ruoli;
import com.giovanni.Azienda.model.Salario;
import com.giovanni.Azienda.model.Turni;
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
	DatiAziendaliService das;
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

	/*--------------------------Bonus-----------*/

	@PostMapping("/saveBonus/{id}")
	public void saveBonus(HttpSession session, @PathVariable int id) {
		Bonus b = new Bonus();
		bs.saveBonus(b);
	}

	@GetMapping("/bonus")
	public List<Bonus> getBonuses() {
		return bs.getAll();
	}

	@GetMapping("/getIdBonus/{id}")
	public Optional<Bonus> getIdBonus(HttpSession session, @PathVariable int id) {
		Optional<Bonus> b = bs.findById(id);
		return b;
	}

	@GetMapping("/deleteBonus/{id}")
	public void deleteBonus(HttpSession session, @PathVariable int id) {
		Bonus b = new Bonus();
		bs.deleteImpiegati(b);
	}

	/*--------------------------DatiAziendali-----------*/

	@PostMapping("/saveDatiAziendali/{id}")
	public void saveDatiAziendali(HttpSession session, @PathVariable int id) {
		DatiAziendali da = new DatiAziendali();
		das.saveDatiAziendali(da);
	}

	@GetMapping("/datiaziendali")
	public List<DatiAziendali> getDatiAziendali() {
		return das.getAll();
	}

	@GetMapping("/getIdDatiAziendali/{id}")
	public Optional<DatiAziendali> getIdDatiAziendali(HttpSession session, @PathVariable int id) {
		Optional<DatiAziendali> da = das.findById(id);
		return da;
	}

	@GetMapping("/deleteDatiAziendali/{id}")
	public void deleteDatiAziendali(HttpSession session, @PathVariable int id) {
		DatiAziendali da = new DatiAziendali();
		das.deleteDatiAziendali(da);
	}

	/*--------------------------Dipartimenti-----------*/

	@PostMapping("/saveDipartimenti/{id}")
	public void saveDipartimenti(HttpSession session, @PathVariable int id) {
		Dipartimenti d = new Dipartimenti();
		ds.saveDipartimenti(d);
	}

	@GetMapping("/dipartimenti")
	public List<Dipartimenti> getDipartimenti() {
		return ds.getAll();
	}

	@GetMapping("/getIdDipartimenti/{id}")
	public Optional<Dipartimenti> getIdDipartimenti(HttpSession session, @PathVariable int id) {
		Optional<Dipartimenti> d = ds.findById(id);
		return d;
	}

	@GetMapping("/deleteDipartimenti/{id}")
	public void deleteDipartimenti(HttpSession session, @PathVariable int id) {
		Dipartimenti d = new Dipartimenti();
		ds.deleteDipartimenti(d);

	}

	@GetMapping("/findQtaImpXDip")
	public List<Dipartimenti> findQtaImpXDip(HttpSession session, @PathVariable int id) {
		List<Dipartimenti> listaD = ds.getAll();
		return listaD;
	}

	/*--------------------------Ferie-----------*/

	@PostMapping("/saveFerie/{id}")
	public void saveFerie(HttpSession session, @PathVariable int id) {
		Ferie f = new Ferie();
		fs.saveFerie(f);
	}

	@GetMapping("/ferie")
	public List<Ferie> getFerie() {
		return fs.getAll();
	}

	@GetMapping("/getIdFerie/{id}")
	public Optional<Ferie> getIdFerie(HttpSession session, @PathVariable int id) {
		Optional<Ferie> f = fs.findById(id);
		return f;
	}

	@GetMapping("/deleteFerie/{id}")
	public void deleteFerie(HttpSession session, @PathVariable int id) {
		Ferie f = new Ferie();
		fs.deleteFerie(f);

	}

	/*--------------------------Impiegati-----------*/

	@PostMapping("/saveImpiegati/{id}")
	public void saveImpiegati(HttpSession session, @PathVariable long id) {
		Impiegati i = new Impiegati();
		is.saveImpiegati(i);
	}

	@GetMapping("/impiegati")
	public List<Impiegati> getImpiegati() {
		return is.getAll();
	}

	@GetMapping("/getIdImpiegati/{id}")
	public Optional<Ferie> getIdImpiegati(HttpSession session, @PathVariable int id) {
		Optional<Ferie> f = fs.findById(id);
		return f;
	}

	@GetMapping("/deleteImpiegati/{id}")
	public void deleteImpiegati(HttpSession session, @PathVariable int id) {
		Impiegati i = new Impiegati();
		is.deleteImpiegati(i);

	}

	/*--------------------------Permessi-----------*/

	@PostMapping("/savePermessi/{id}")
	public void savePermessi(HttpSession session, @PathVariable long id) {
		Permesso p = new Permesso();
		pers.savePermesso(p);
	}

	@GetMapping("/permessi")
	public List<Permesso> getPermessi() {
		return pers.getAll();
	}

	@GetMapping("/getIdPermessi/{id}")
	public Optional<Permesso> getIdPermessi(HttpSession session, @PathVariable int id) {
		Optional<Permesso> p = pers.findById(id);
		return p;
	}

	@GetMapping("/deletePermessi/{id}")
	public void deletePermessi(HttpSession session, @PathVariable int id) {
		Permesso p = new Permesso();
		pers.deletePermesso(p);

	}

	@GetMapping("/findQtaPermessiPerRuolo")
	public List<Permesso> findQtaPermessiPerRuolo(HttpSession session, @PathVariable int id) {
		List<Permesso> listaD = pers.getAll();
		return listaD;
	}

	/*--------------------------Presenze-----------*/

	@PostMapping("/savePresenze/{id}")
	public void savePresenze(HttpSession session, @PathVariable long id) {
		Presenze p = new Presenze();
		pres.savePresenze(p);
	}

	@GetMapping("/presenze")
	public List<Presenze> getPresenze() {
		return pres.getAll();
	}

	@GetMapping("/getIdPresenze/{id}")
	public Optional<Presenze> getIdPresenze(HttpSession session, @PathVariable int id) {
		Optional<Presenze> p = pres.findById(id);
		return p;
	}

	@GetMapping("/deletePresenze/{id}")
	public void deletePresenze(HttpSession session, @PathVariable int id) {
		Presenze p = new Presenze();
		pres.deletePresenze(p);

	}
	
	@GetMapping("/findQtaPresenze")
	public List<Presenze> findQtaPresenze(HttpSession session, @PathVariable int id) {
		List<Presenze> listaD = pres.getAll();
		return listaD;
	}
	
	@GetMapping("/findQtaAssenze")
	public List<Presenze> findQtaAssenze(HttpSession session, @PathVariable int id) {
		List<Presenze> listaD = pres.getAll();
		return listaD;
	}
	
	@GetMapping("/findOrePermessi")
	public List<Presenze> findOrePermessi(HttpSession session, @PathVariable int id) {
		List<Presenze> listaD = pres.getAll();
		return listaD;
	}
	

	/*--------------------------Reparti-----------*/

	@PostMapping("/reparto/{id}")
	public void saveReparti(HttpSession session, @PathVariable long id) {
		Reparti r = new Reparti();
		reps.saveReparti(r);
	}

	@GetMapping("/reparti")
	public List<Presenze> getReparti() {
		return pres.getAll();
	}

	@GetMapping("/getIdReparti")
	public Optional<Reparti> getIdReparti(HttpSession session, @PathVariable int id) {
		Optional<Reparti> p = reps.findById(id);
		return p;
	}

	@GetMapping("/deleteReparti/{id}")
	public void deleteReparti(HttpSession session, @PathVariable int id) {
		Reparti r = new Reparti();
		reps.deleteReparti(r);

	}
	
	@GetMapping("/findQtaImpXRep")
	public List<Reparti> findQtaImpXRep(HttpSession session, @PathVariable int id) {
		List<Reparti> listaD = reps.getAll();
		return listaD;
	}
	/*--------------------------Ruoli-----------*/
	
	@PostMapping("/ruolo/{id}")
	public void saveRuoli(HttpSession session, @PathVariable long id) {
		Ruoli r = new Ruoli();
		ruos.saveRuoli(r);
	}

	@GetMapping("/ruoli")
	public List<Ruoli> getRuoli() {
		return ruos.getAll();
	}

	@GetMapping("/getIdRuoli/{id}")
	public Optional<Ruoli> getIdRuoli(HttpSession session, @PathVariable int id) {
		Optional<Ruoli> r = ruos.findById(id);
		return r;
	}

	@GetMapping("/deleteRuoli/{id}")
	public void deleteRuoli(HttpSession session, @PathVariable int id) {
		Ruoli r = new Ruoli();
		ruos.deleteRuoli(r);

	}
	
	/*--------------------------Salari-----------*/
	
	@PostMapping("/salario/{id}")
	public void saveSalari(HttpSession session, @PathVariable long id) {
		Salario s = new Salario();
		ss.saveSalari(s);
	}

	@GetMapping("/salari")
	public List<Salario> getSalari() {
		return ss.getAll();
	}
	
	@GetMapping("/getIdSalari/{id}")
	public Optional<Salario> getIdSalari(HttpSession session, @PathVariable int id) {
		Optional<Salario> s = ss.findById(id);
		return s;
	}
	
	@GetMapping("/deleteSalari/{id}")
	public void deleteSalari(HttpSession session, @PathVariable int id) {
		Ruoli r = new Ruoli();
		ruos.deleteRuoli(r);

	}

	/*--------------------------Turni-----------*/

	@PostMapping("/turni/{id}")
	public void saveTurni(HttpSession session, @PathVariable long id) {
		Turni t = new Turni();
		ts.saveTurni(t);
	}
	
	@GetMapping("/turni")
	public List<Turni> getTurni() {
		return ts.getAll();
	}
	
	@GetMapping("/getIdTurni/{id}")
	public Optional<Salario> getIdTurni(HttpSession session, @PathVariable int id) {
		Optional<Salario> s = ss.findById(id);
		return s;
	}
	
	@GetMapping("/deleteTurni/{id}")
	public void deleteTurni(HttpSession session, @PathVariable int id) {
		Turni t = new Turni();
		ts.deleteTurni(t);

	}
}
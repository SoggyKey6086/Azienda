	package com.giovanni.Azienda.controller;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.giovanni.Azienda.model.Ruoli;
import com.giovanni.Azienda.model.DatiAziendali;
import com.giovanni.Azienda.model.Impiegati;
import com.giovanni.Azienda.model.Reparti;
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

@Controller
@Scope("session")
public class GenController {
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
	
	@GetMapping(value = "/")
	public ModelAndView homepage(HttpSession session) {
		List<Reparti> listaReparti = reps.getAll();
		List<String[]> lista = new ArrayList<String[]>();
		for(Reparti r : listaReparti) {
			String[] s = {r.getNome(), String.valueOf(reps.findQtaImpXRep(r.getIdRep()))};
			lista.add(s);
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("homepage");
		mv.addObject("listaReparti", lista);
		return mv;
	}
	//-------------------------- Reparto --------------------
	@GetMapping(value = "/reparto")
	public ModelAndView gestioneReparto(HttpSession session) {
		List<Reparti> listaR = reps.getAll();
		List<String[]> lista = new ArrayList<String[]>();
		for(Reparti r : listaR) {
			String[] s = {String.valueOf(r.getIdRep()) ,r.getNome(), r.getDescrizione()};
			lista.add(s);
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("reparto", new Reparti());
		mv.addObject("lista", lista);
		mv.setViewName("reparto");
		return mv;
	}
	
	@PostMapping(value = "/aggiungiReparto")
	public ModelAndView aggiungiReparti(Reparti reparti) {
		reps.saveReparti(reparti);
		return new ModelAndView("redirect:/reparto");
	}
	
	@GetMapping(value = "/deleteReparto/{id}")
	public ModelAndView deleteReparti(@PathVariable int id) {
		Reparti r = reps.findById(id).get();
		reps.deleteReparti(r);
		return new ModelAndView("redirect:/reparto");
	}
	
	//-------------------------- Impiegati --------------------
	
	@GetMapping(value = "/impiegato")
	public ModelAndView gestioneImpiegato(HttpSession session) {
		List<Impiegati> listaI = is.getAll();
		List<String[]> lista = new ArrayList<String[]>();
		for(Impiegati i : listaI) {
			String[] s = {String.valueOf(i.getIdImp()) ,i.getNome(), i.getCap(), i.getCitta(), i.getCognome(), String.valueOf(i.getRepartiImp()), String.valueOf(i.getRuoliImp())};
			lista.add(s);
		}
		List<Reparti> listaR = reps.getAll();
		List<String> lista2 = new ArrayList<String>();
		for(Reparti r : listaR) {
			String s = String.valueOf(r.getIdRep());
			lista2.add(s);
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("impiegato", new Impiegati());
		mv.addObject("lista", lista);
		mv.setViewName("impiegato");
		return mv;
	}
	
	@PostMapping(value = "/aggiungiImpiegato")
	public ModelAndView aggiungiReparti(Impiegati impiegati) {
		is.saveImpiegati(impiegati);
		return new ModelAndView("redirect:/impiegato");
	}
	
	@GetMapping(value = "/deleteImpiegato/{id}")
	public ModelAndView deleteImpiegati(@PathVariable int id) {
		Impiegati i = is.findById(id).get();
		is.deleteImpiegati(i);
		return new ModelAndView("redirect:/impiegato");
	}
	
	//-------------------------- Ruolo --------------------

		@GetMapping(value ="/ruoli")
		public ModelAndView gestioneRuoli(HttpSession session) {
			List<Ruoli> listaRuoli = ruos.getAll();
			List<String[]> lista =new ArrayList<String[]>();
			for(Ruoli r : listaRuoli) {
				String[] s = {String.valueOf(r.getIdR()), r.getNome(), r.getDescrizione()};
				lista.add(s);
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("ruoli", new Ruoli());
		mv.addObject("lista", lista);
		mv.setViewName("ruoli");
		return mv;	
	}

		@PostMapping(value ="/aggiungiRuoli")
		public ModelAndView aggiungiRuoli(Ruoli ruoli) {
			ruos.saveRuoli(ruoli);
			return new ModelAndView("redirect:/ruoli");
		}
		
		@GetMapping(value ="/deleteRuoli/{id}")
		public ModelAndView deleteRuoli(@PathVariable int id) {
			Ruoli r = ruos.findById(id).get();
			ruos.deleteRuoli(r);
			return new ModelAndView("redirect:/ruoli");
			
		}
		
//	//-------------------------- DatiAziendali --------------------
//		
//		@GetMapping(value="/datiAziendali")
//		public ModelAndView gestionedatiAziendali(HttpSession session) {			
//			List<DatiAziendali> listaDA = das.getAll();
//			List<String[]> lista = new ArrayList<String[]>();
//			for(DatiAziendali d : listaDA) {
//				String[] s = {String.valueOf(d.getIdDA()), String.valueOf(d.getData_assunzione()), String.valueOf(d.getData_nascita()), String.valueOf(d.getSalario()),d.getEmail()};
//				lista.add(s);
//			}
//			ModelAndView mv = new ModelAndView();
//			mv.addObject("datiaziendali", new DatiAziendali());
//			mv.addObject("lista", lista);
//			mv.setViewName("datiaziendali");
//			return mv;
//	}	
//		@PostMapping(value ="/aggiungiDatiAziendali")
//		public ModelAndView aggiungiDatiAziendali(Ruoli ruoli) {
//			ruos.saveRuoli(datiAziendali);
//			return new ModelAndView("redirect:/datiAziendali");
//		}
//		
//		@GetMapping(value ="/deleteRuoli/{id}")
//		public ModelAndView deleteDatiAziendali(@PathVariable int id) {
//			DatiAziendali da = das.findById(id).get();
//			das.deletedatiAziendali(da);
//			return new ModelAndView("redirect:/datiAziendali");
//			
//		}
}

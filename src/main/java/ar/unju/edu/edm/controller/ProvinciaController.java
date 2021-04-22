package ar.unju.edu.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.unju.edu.edm.model.Provincia;
@Controller
public class ProvinciaController {
	
	@Autowired
	Provincia unaProvincia;
	
	@GetMapping({"/provincia"})
	public String cargarProvincia(Model model) {
		unaProvincia.setNombreDeProvincia("Jujuy, Argentina");
		model.addAttribute("marcos", unaProvincia);
		return "provincia";
	}
	
	
	
}

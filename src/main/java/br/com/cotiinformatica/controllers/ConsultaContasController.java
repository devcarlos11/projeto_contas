package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConsultaContasController {

	@RequestMapping (value ="/admin/consulta-contas")
	public ModelAndView consultaContas() {
		ModelAndView modelAndView = new ModelAndView("admin/consulta-contas");
		return modelAndView;
	
	}

}

package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroContasController {

	@RequestMapping(value = "/admin/cadastro-contas")
	public ModelAndView cadastroContas() {
		ModelAndView modelAndView = new ModelAndView("/admin/cadastro-contas");
		return modelAndView;
	}

}

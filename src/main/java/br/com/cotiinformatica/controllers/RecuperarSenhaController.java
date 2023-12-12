package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecuperarSenhaController {
	
	// definindo a rota para recuperação de senha 
	@RequestMapping(value = "/recuperar-senha")
	public ModelAndView recuperarSenha() {

		// definindo qual página será aberta no navegador:
		// WEB-INF/views/recuperar-senha.jsp

		ModelAndView modelAndView = new ModelAndView("recuperar-senha");
		return modelAndView;

	}

}

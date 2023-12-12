package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CriarUsuarioController {

	// definindo a rota para criação de usuário
	@RequestMapping(value = "/criar-usuario")
	public ModelAndView criarUsuario() {

		// definindo qual página será aberta no navegador:
		// WEB-INF/views/criar-usuario.jsp

		ModelAndView modelAndView = new ModelAndView("criar-usuario");
		return modelAndView;

	}

}

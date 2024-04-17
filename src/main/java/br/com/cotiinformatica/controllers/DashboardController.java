package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController {

	@RequestMapping(value = "/admin/dashboard")
	public ModelAndView dashboard() {
		ModelAndView modelAndView = new ModelAndView("admin/dashboard");
		return modelAndView;

	}

}

package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value={"/" , "/index"})
	public ModelAndView index(){
		return new ModelAndView("index");
	}
	
	@RequestMapping("clientes")
	public String msgTeste(){
		System.out.println("chamou o controlador...");
		return "cliente";
	}
	
}

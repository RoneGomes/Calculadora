package br.com.recode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.recode.model.Calculadora;

	@Controller
public class Calculos {


	
		private Model model;
		@GetMapping("/")
	    public String Home() {
	        return "Home";
	    }
		
		@GetMapping("/soma")
	    public String somar(final Model model) {

	        model.addAttribute("calculadora", new Calculadora());

	        return "soma";
	    }

	    @PostMapping("/somar")
	    public String result(@ModelAttribute Calculadora calculadora) {
	        calculadora.somar();
	        return "result";
	    }
	    
	 @GetMapping("/sub")
	    public String sub(final Model model) {

	        this.model = model;
			model.addAttribute("calculadora", new Calculadora());

	        return "sub";
	    }
	    
	    @PostMapping("/subtrair")
	    public String result2(@ModelAttribute Calculadora calculadora) {
	        calculadora.subtrair();
	        return "result";
	    }
	@GetMapping("/mult")
    public String mult() {
        return "mult";
    }
	@GetMapping("/div")
    public String div() {
        return "div";
    }

}

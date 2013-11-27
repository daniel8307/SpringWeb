package com.naskar.springmvc.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.naskar.springmvc.domain.Teste;
import com.naskar.springmvc.domain.Teste2;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        return mav;
    }
	
	@RequestMapping("/home/welcome")
    public ModelAndView welcome() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("welcome");
        
        mav.addObject("message", "Bem vindo!!!");
        
        return mav;
    }
	
	
	@RequestMapping(value="/home/teste", method = RequestMethod.GET)
	public @ResponseBody Teste getShopInJSON() {
        List<Teste2> listTeste = new ArrayList<Teste2>();
		Teste teste = new Teste();
		teste.setId(1);
		teste.setNome("teste");
		
		Teste2 teste2 = new Teste2();
		teste2.setId(11);
		teste2.setNome("teste2");
		listTeste.add(teste2); 
        teste.setLista(listTeste);
		return teste;
 
	}

}

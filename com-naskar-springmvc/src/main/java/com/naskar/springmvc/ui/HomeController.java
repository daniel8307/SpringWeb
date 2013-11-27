package com.naskar.springmvc.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value = "/home/teste", method = RequestMethod.GET)
	public @ResponseBody
	Teste getShopInJSON() {
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

	@RequestMapping(value = "/home/teste/{id}/{nome}", method = RequestMethod.GET)
	public @ResponseBody
	Teste getShopInJSON(@PathVariable int id, @PathVariable String nome) {
		List<Teste2> listTeste = new ArrayList<Teste2>();
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(id, nome);
		Teste teste = new Teste();
		teste.setId(id);
		teste.setNome(nome);

		Teste2 teste2 = new Teste2();
		teste2.setId(id);
		teste2.setNome(nome);
		listTeste.add(teste2);

		teste.setListMap(map);
		teste.setLista(listTeste);
		return teste;

	}

}

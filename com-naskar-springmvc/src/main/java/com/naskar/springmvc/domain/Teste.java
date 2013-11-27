package com.naskar.springmvc.domain;

import java.util.List;

public class Teste {
	private int id;
	private String nome;
	private List<Teste2> lista;

	public List<Teste2> getLista() {
		return lista;
	}

	public void setLista(List<Teste2> lista) {
		this.lista = lista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

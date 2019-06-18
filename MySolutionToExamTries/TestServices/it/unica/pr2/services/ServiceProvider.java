package it.unica.pr2.services;

import java.util.*;

public class ServiceProvider extends HashMap<String, Service>{

	public String nome;

	public ServiceProvider(String nome){
		this.nome = nome;
	}
	
	public <T extends Object>T execute(String nome, T num) {
		
		Service s = this.get(nome);
		return (T)s.execute((Object)num);
	}
	
}

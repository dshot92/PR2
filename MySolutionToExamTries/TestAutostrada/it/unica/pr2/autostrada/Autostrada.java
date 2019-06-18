package it.unica.pr2.autostrada;

import java.util.*;

public class Autostrada extends HashSet<Auto>{

	private String nome;

	private List<String> casello = new ArrayList<String>();

	public Autostrada(String nome){
		this.nome = nome;
	}
	
	public boolean add(Auto auto) throws AutoInDueAutostradeException {
			Mezzo a = (Mezzo)auto;
			if(a.alreadyInAutostrada) throw new AutoInDueAutostradeException();
			super.add(auto);
			
			a.alreadyInAutostrada = true;
			this.casello.add( (a.getClass().getSimpleName() + " colore " + a.getColore() + " targata " + a.getTarga() + " entra in " + this.nome) );
		return true;		
		
	}
	
	public boolean remove(Mezzo auto){
			auto.alreadyInAutostrada = false;
			super.remove(auto);
			this.casello.add( (auto.getClass().getSimpleName() + " colore " + auto.getColore() + " targata " + 							auto.getTarga() + " esce da " + this.nome) );
		return true;
		
	}

	public List<String> casello(){
		return this.casello;
	}

}

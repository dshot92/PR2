package it.unica.pr2.ricercatori;

import java.util.*;

public class Journal extends Articolo {

	public String titolo;

	public Journal(String titolo, Ricercatore... ric) throws AutoreMancante{
		super(titolo);
		boolean atLeastOne = false;
		for(Ricercatore r : ric){
			listaAutori.add(r);
			atLeastOne = true;
		}
		if(!atLeastOne) throw new AutoreMancante();
	}
	
	public String getTitolo(){
		return this.titolo;
	}
	
	public int numeroAutori(){
		return this.listaAutori.size();
	}

}

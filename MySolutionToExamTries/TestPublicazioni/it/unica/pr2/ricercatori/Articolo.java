package it.unica.pr2.ricercatori;

import java.util.*;

public class Articolo{

	public String titolo;
	public List<Ricercatore> listaAutori = new ArrayList<Ricercatore>();

	public Articolo(String titolo){
		this.titolo=titolo;
	}

	public boolean equals(Object obj){
	if(this == obj) return true;
	if(!(obj instanceof Journal)) return false;
	Articolo j = (Articolo)obj;
	return this.titolo.equals(j.titolo);
	}
	
	public int numeroAutori(){
		return this.listaAutori.size();
	}

}


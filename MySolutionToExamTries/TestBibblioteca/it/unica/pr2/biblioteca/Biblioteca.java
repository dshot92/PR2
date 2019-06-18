package it.unica.pr2.biblioteca;

import java.util.*;
import it.unica.pr2.biblioteca.eccezioni.LibroNonValidoException;
import it.unica.pr2.biblioteca.libreria.Libro;


public class Biblioteca extends ArrayList<Libro> {
	
	private String stato;

	public Biblioteca(Libro[] list){
		if(list.length == 0) this.stato = "Nessun libro presente.";
		for(Libro l : list){
		 this.add(l);
		}
	}

	public int pagine(){
		int sum = 0;
		for(Libro l : this) sum += l.pagine();
		return sum;
	}
	
	@Override
	public String toString(){
		String toReturn = "";
		if(this.stato != null)return this.stato;
		else{
			for(Libro l : this){
				toReturn = toReturn + l.toString();
			}
			toReturn = toReturn.substring(0, (toReturn.length())-2);
			toReturn += ".";
			return toReturn;
		}
	}
}

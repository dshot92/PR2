package it.unica.pr2.biblioteca.libreria;

import java.util.*;
import it.unica.pr2.biblioteca.eccezioni.LibroNonValidoException;
import it.unica.pr2.biblioteca.Biblioteca;

public class Libro implements Comparable<Libro>{

	private String titolo;
	private int pagine;
	
	public Libro(String titolo, int pagine) throws LibroNonValidoException{
		if( pagine < 0) throw new LibroNonValidoException();
		this.titolo = titolo;	
		this.pagine = pagine;
	}
	
	public int pagine(){
		return this.pagine;
	}

	public String titolo(){
		return this.titolo;
	}

	@Override
	public int compareTo(Libro l){
		return (this.pagine - l.pagine());
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if( !(obj instanceof Libro) ) return false;
		Libro l = (Libro)obj;
		if(this.pagine == l.pagine() && this.titolo.equals(l.titolo())) return true;
		return false;
	}
	
	@Override 
	public String toString(){
		return (this.titolo + ": " + this.pagine + "; ");
	}
	

}


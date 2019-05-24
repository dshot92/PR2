package it.unica.pr2.biblioteca.libreria;
import java.util.ArrayList;
import it.unica.pr2.biblioteca.eccezioni.LibroNonValidoException;


public class Libro implements Comparable<Libro>{

	private String titolo;
	private int num_pagine;

	public Libro(String titolo, int num_pagine) {
		this.titolo = titolo;
		if(num_pagine >= 0){
			this.num_pagine = num_pagine;
		}else{
			throw new LibroNonValidoException("Numero Pagine Negativo");
		}
	}

	public String getTitolo(){
		return this.titolo;
	}

	public int getPag(){
		return this.num_pagine;
	}

	@Override
	public String toString(){
		return (this.titolo + ": " + num_pagine + "; ");
	}

	@Override
	public int compareTo(Libro l){
		return this.getPag() - l.getPag();
	}

	@Override
	public boolean equals(Object o){
		if( this == o) return true;
		if( o == null) return false;
		if( ! ( o instanceof Libro )) return false;
		Libro l = (Libro) o;
		if(l.getTitolo() == this.getTitolo() && l.getPag() == this.getPag()) return true;

		return false;
	}

}

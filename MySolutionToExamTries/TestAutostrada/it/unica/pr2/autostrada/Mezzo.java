package it.unica.pr2.autostrada;

import java.util.*;

public class Mezzo {

	String colore;
	String targa;
	boolean alreadyInAutostrada = false;

	public Mezzo(String colore, String targa){
		this.colore = colore;
		this.targa = targa;
	}

	@Override
	public boolean equals(Object obj){
	
		if(this == obj) return true;
		if( !(obj instanceof Mezzo) ) return false;
	
		Mezzo m = (Mezzo)obj;

		if( m.targa.equals(this.targa)) return true;


		return false;

	}

	public String getColore(){
		return this.colore;
	}

	public String getTarga(){
		return this.targa;
	}
	

}

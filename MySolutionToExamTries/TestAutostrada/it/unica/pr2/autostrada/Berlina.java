package it.unica.pr2.autostrada;

import java.util.*;

public class Berlina extends Mezzo implements Auto{

	String colore;
	String targa;

	public Berlina(String colore, String targa){
		super(colore, targa);		
		this.colore = colore;
		this.targa = targa;
	}

	public String targa(){
		return this.targa;	
	}

}

package it.unica.pr2.autostrada;

import java.util.*;

public class StationWagon extends Mezzo implements Auto{

	private String colore;
	private String targa;

	public StationWagon(String colore, String targa){
		super(colore, targa);		
		this.colore = colore;
		this.targa = targa;
	}


	public String targa(){
		return this.targa;	
	}
}

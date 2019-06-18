package it.unica.pr2.autostrada;

import java.util.*;

public class Moto extends Mezzo{

	private String colore;
	private String targa;

	public Moto(String colore, String targa){
		super(colore, targa);
		this.colore = colore;
		this.targa = targa;
	}


}

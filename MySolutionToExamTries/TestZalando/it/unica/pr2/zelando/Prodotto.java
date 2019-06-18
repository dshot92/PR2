package it.unica.pr2.zelando;

import java.util.*;

public class Prodotto{

	private String color;
	private Double price;
	
	public Prodotto(String color, Double price){
		this.color=color;
		this.price=price;
	}
	
	public String descrizione(){
		return this.color;
	}
	
		public Double prezzo(){
		return this.price;
	}
}




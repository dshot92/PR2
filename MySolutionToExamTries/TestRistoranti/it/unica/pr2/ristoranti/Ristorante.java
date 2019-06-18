package it.unica.pr2.ristoranti;

import java.util.*;

public class Ristorante {

	static int numeroRistotanti = 0;
	static int postiTotali = 0;

	String nome;
	public int posti;
	public int occupati = 0;
	Menu menu;
	Order order;

	public Ristorante(String nome, int posti, Menu menu){
		this.nome = nome;
		this.posti = posti;
		this.menu = menu;
		++numeroRistotanti;
		postiTotali += posti;
	}
	
	static public int numeroRistoranti(){
		return numeroRistotanti;
	}
	
	public int posti(){
		return this.posti;
	}
	
	static public int totalePosti(){
		return postiTotali;
	}
	
	public Menu menu(){
		return this.menu;
	}
	
		public boolean isInTheMenu(String toSearch){

		Set<String> keyset = this.menu.keySet();
		for(String s : keyset){
			if(s.equals(toSearch)){
			return true;
			}
		}
		return false;
		}

		public String mostExpensive(){
			return (menu.mostExpensive());
		}
		
		public Order order(String... cibi) throws TooMuchPeopleException {
			Order nuovo = new Order(cibi);
			if( ( this.occupati + nuovo.people()) > this.posti  ){
					throw new TooMuchPeopleException();
			}else{
			this.order = nuovo;
				this.occupati += order.people();
				for(String s: cibi){
					if(this.isInTheMenu(s)){
						this.order.cost += this.menu.get(s);
					}
				}
			}	
			return this.order;
		}	
}

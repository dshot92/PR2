package it.unica.pr2.zelando;

import java.util.*;

public class Carrello extends ArrayList<Prodotto>{

	public Carrello(){
	}

	public Carrello(Prodotto[] p){
		for(Prodotto aux : p)
			this.add(aux);
	}
	
	public double costo(){
		double total = 0;
		for(Prodotto aux : this)
			total+=aux.prezzo();
		return total;
	}

	public List<ProdottoDonna> prodottiDonna(){
		List<ProdottoDonna> l = new ArrayList<ProdottoDonna>();
		
		for(Prodotto p : this){
			if(p instanceof ProdottoDonna) l.add((ProdottoDonna)p);
		}
		return l;
	}

	public int nProdottiDonna(){

		int count = 0;
		
		for (Prodotto p : this){
			if(p instanceof ProdottoDonna)
				++count;
		}
		return count;
	}
	
	public int nProdottiUomo(){

		int count = 0;
		
		for (Prodotto p : this){
			if(p instanceof ProdottoUomo)
				++count;
		}
		return count;
	}
	
	public int nProdotti(){

		int count = 0;
		
		for (Prodotto p : this){
			if(p instanceof Prodotto)
				++count;
		}
		return count;
	}
		
	public Carrello nProdotti(String toSearch){
		Carrello toReturn = new Carrello();
		
		String[] strings = toSearch.split(" ");
		
		for(int i = 0; i < strings.length ; i++){
			for(Prodotto p : this){
				if(p.descrizione().contains(strings[i])){
					toReturn.add(p);
					return toReturn;
				}
			}
		}
		
		return toReturn;
	}

	public static Carrello fromList(List l){

		ArrayList<Prodotto> aux = new ArrayList<>();
		Carrello toReturn = new Carrello();
		
		for(Object obj: l){
			if(obj instanceof Prodotto)
				aux.add((Prodotto)obj);
		}
		for(Prodotto p: aux) 
			toReturn.add(p);
			
		return toReturn;
	}

}

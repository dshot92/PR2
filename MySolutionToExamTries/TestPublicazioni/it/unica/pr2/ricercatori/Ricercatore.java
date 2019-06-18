package it.unica.pr2.ricercatori;

import java.util.*;

public class Ricercatore {

		private String nome;
		private String cognome;
		
		public static Ricercatore seStesso;

		Pubblicazioni pubblicazioni;
		
		private List<Articolo> pubblicazioni = new ArrayList<Articolo>();

		public Ricercatore(String nome, String cognome){
			this.nome = nome;
			this.cognome = cognome;
		}
		
		public List<Articolo> pubblicazioni(){
			return this.pubblicazioni;
		}

		public static Ricercatore seStesso(){
			return seStesso;
		}
}

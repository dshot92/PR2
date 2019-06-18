package it.unica.pr2;

import java.util.stream.Collectors;
import java.util.*;

public class Utente implements Tuitter{

	private String nome;
	private TestTuitter.Data data;

	public Utente(String nome, TestTuitter.Data data){
		this.nome = nome.toLowerCase();
		this.data = data;
	}
	
	public String username(){
		return this.nome;
	}	
	
	public TestTuitter.Data data(){
		return this.data;
	}	
	
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if( !(obj instanceof Utente) ) return false;
		Utente u = (Utente)obj;
		if(this.nome.equals(u.username())){
		if(	this.data.anno == u.data.anno){
	    	if(this.data.mese == u.data.mese){
	    	if(this.data.giorno == u.data.giorno){
					 return true;
				 }
				}
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return this.nome + ", "+this.data.giorno + "-" +this.data.mese + "-"+this.data.anno;
	
	}


}

package it.unica.pr2.risorseWeb;

import java.util.*;
import java.io.*;
import java.lang.*;


public class RisorsaWeb extends File {

	String contenuto;
	String nome;

	public RisorsaWeb(String nome, String contenuto){
		super(nome, contenuto);
		this.nome = nome;
		this.contenuto = contenuto;
	}

     public RisorsaWeb(String a){
        super(a);
        
        this.nome=a;
        
    }   
		
		public String getNome(){
		return this.nome;
	}
	
	public String getContenuto(){
		return this.contenuto;
	}
}

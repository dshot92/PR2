package it.unica.pr2.pizza;

import java.util.*;

public class Cliente extends User{

	private String nome;
	private String cognome;
	private String email;

	
		public Cliente(String nome, String cognome, String email){
		super(email);
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}

	public String nome(){
		return this.nome;
	}
		public String cognome(){
		return this.cognome;
	}

	@Override
	public String toString(){
		return this.nome + " " + this.cognome + " (" + this.email + ")";
	}

	@Override
	public boolean equals(Object obj) throws UserEmailMismatch{
		if (this == obj) return true;
		if( !(obj instanceof Cliente) ) return false;
		Cliente c = (Cliente)obj;
		if( this.email().equals(c.email()) ){
			if( !(this.nome.equals(c.nome())))	throw new UserEmailMismatch();
			if( !(this.cognome.equals(c.cognome())))	throw new UserEmailMismatch();
			return true;
		}		
		return false;
	}


}

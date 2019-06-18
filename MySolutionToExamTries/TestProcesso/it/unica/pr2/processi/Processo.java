package it.unica.pr2.processi; // stuff must be here

import java.util.*;

public class Processo extends Task {

	public Processo(){
		super();
	}

	static public Processo getOrdini(){
		return new Processo();
	}
	
	@Override
	public String toString(){
		String ret = "";
		for(Task t : this){
			ret = ret + t.toString();
		}
		return ret;
	}
	
}

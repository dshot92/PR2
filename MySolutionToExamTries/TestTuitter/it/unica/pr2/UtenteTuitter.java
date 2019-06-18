package it.unica.pr2;


import java.util.stream.Collectors;
import java.util.*;

public class UtenteTuitter extends Utente implements Comparable<UtenteTuitter>{

	public UtenteTuitter(String nome, TestTuitter.Data data){
		super(nome, data);
	}

	@Override
	public int compareTo(UtenteTuitter u){
		TestTuitter.Data d1 = this.data();
		TestTuitter.Data d2 = u.data();
		int toReturn = d2.anno - d1.anno;
		if(toReturn == 0) toReturn = d2.mese - d1.mese;
		if(toReturn == 0) toReturn = d2.giorno - d1.giorno;
		return toReturn;
	}

	
	
	static public int ordineAlfabetico(UtenteTuitter a, UtenteTuitter b){
		return a.username().compareTo(b.username());	
	}
}

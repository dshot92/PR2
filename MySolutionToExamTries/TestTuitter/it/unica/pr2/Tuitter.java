package it.unica.pr2;


import java.util.stream.Collectors;
import java.util.*;
 

public interface Tuitter {

	static public SortedSet<UtenteTuitter> utenti = new TreeSet<UtenteTuitter>();
	static public SortedSet<UtenteTuitter> tempo = new TreeSet<UtenteTuitter>();
	

	static public UtenteTuitter creaUtente(String nome, TestTuitter.Data data){
			UtenteTuitter aux = new UtenteTuitter(nome, data);

			boolean flag = false;
			for(UtenteTuitter u : tempo){
				if( (aux.equals(u)) ){
					flag =true;
					aux = u;
				}
			}
			if(!flag){
				tempo.add(aux);
			}
			return (UtenteTuitter)aux;
	}
	
	static public SortedSet<UtenteTuitter> utenti(){

		for(UtenteTuitter u : tempo) utenti.add(u);
		
		return utenti;
	}

}

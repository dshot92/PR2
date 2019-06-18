package it.unica.pr2.ristoranti;

import java.util.*;

public class Menu extends TreeMap<String, Double>{


	
	public String mostExpensive(){
		String key = null;
		Double max = new Double(0);
		Set<String> keyset = this.keySet();
		for(String s : keyset){
			if(this.get(s) > max){
				max = this.get(s);
				key = s;
			}
		}
		return key;
		}
		
}

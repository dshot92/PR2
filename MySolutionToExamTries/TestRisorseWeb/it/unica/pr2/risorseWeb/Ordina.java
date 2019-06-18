package it.unica.pr2.risorseWeb;

import java.util.*;

public class Ordina extends ArrayList<RisorsaWeb>{
	
	public static List<RisorsaWeb> perCriterioUtente(Set<RisorsaWeb> s, Comparator<RisorsaWeb> c){
			
				List<RisorsaWeb> list = new ArrayList<RisorsaWeb>();
				list.addAll(s);
				
				Collections.sort(list, c);
				
				return list;
	}
	
	public static List<RisorsaWeb> perLunghezzaContenuto(Set<RisorsaWeb> s){
	
	
				List<RisorsaWeb> list = new ArrayList<RisorsaWeb>();
				list.addAll(s);
				
				Collections.sort(list, new Comparator<RisorsaWeb>(){
					@Override
					public int compare(RisorsaWeb a, RisorsaWeb b){
						return ((a.getContenuto().length()) - (b.getContenuto().length()));			
					
					}
				});
				return list;
	}
}

package it.unica.pr2.abitazioni;
 
import java.util.*;


public class StanzeByType implements Comparator<Ambiente>{

	public int compare(Ambiente a, Ambiente b){
		
		if(a instanceof Cucina && b instanceof Cucina){
			return a.compareTo(b);
		}else{
			if(a instanceof Cucina) return -1;
			if(b instanceof Cucina) return  1;
		}
		if(a instanceof CameraDaLetto && b instanceof CameraDaLetto){
				return a.compareTo(b);
		}else{
			if(a instanceof CameraDaLetto) return -1;
			if(b instanceof CameraDaLetto) return  1;
		}
			if(a instanceof Bagno && b instanceof Bagno){
				return a.compareTo(b);
		}else{
			if(a instanceof Bagno) return -1;
			if(b instanceof Bagno) return  1;
		}
		
		return a.compareTo(b);
	}
}

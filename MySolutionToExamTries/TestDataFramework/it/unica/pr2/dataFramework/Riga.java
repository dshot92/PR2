package it.unica.pr2.dataFramework;

import java.util.*;
import it.unica.pr2.dataFramework.*;

public class Riga extends ArrayList<Object>{

	public Riga(){
	}

	public Riga(List l){
		for(Object obj : l)
			this.add(obj);
	}

}

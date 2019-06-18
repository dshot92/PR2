package it.unica.pr2.ristoranti;

import java.util.*;

public class Order extends ArrayList<String>{

	public Double cost = new Double(0);
	

	public Order(String... cibi){
		for(String s : cibi)this.add(s);
	}
	
	public int people(){
		return this.size();
	}
	
		public Double cost(){
			return this.cost;
		}
	
	
	
	
	

}


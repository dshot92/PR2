package it.unica.pr2.dataFramework;

import java.util.*;
import it.unica.pr2.dataFramework.*;

public class Tabella extends ArrayList<List>{

	private List header;

	public Tabella(){
	}
	
	public int rows(){
		return this.size();
	}
	
	public int columns(){
		int max=0;
		for(List l : this){
			max = l.size();
		}
		return max;
	}
	
	public void setHeaders(List l){
		this.header = l;
	}
	
	public List getColumn(String column){
		ArrayList<Object> toReturn = new ArrayList<Object>();
		int index = 0;
		
		for(int i = 0; i < this.header.size(); ++i){
			if( this.header.get(i).equals(column) ) index = i;
		}
		
		for(List l : this)
			toReturn.add(l.get(index));
	
		return toReturn;
	}
	
	public double getAverage(String column) throws ColumnException{
	
		List aux = this.getColumn(column);
		if( !(aux.get(0) instanceof Number )){
			throw new ColumnException();
		}	else{
			
			double mean = 0;
	
			for(Object obj : aux)
		
				mean += Double.parseDouble(obj.toString());


			return mean / aux.size();
		}
	}

/*	
	public List getColumn(String column){
		List toReturn = new List();
		int index = 0;
		int col;
		for(List l : this){
			for(Object obj : l){
				if(obj instanceof String){
					if((String)obj.equals(column)){
						col = index;
					}
				}
				++index;
			}
		}
		
		for(List l : this){
			for(Object obj : l){
			
			}
		}
		return toReturn;
	}
	*/
	
}

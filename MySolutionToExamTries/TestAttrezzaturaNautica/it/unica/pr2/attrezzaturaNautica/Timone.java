package it.unica.pr2.attrezzaturaNautica;

import java.util.*;

public class Timone extends AttrezzaturaNautica{

	private Integer angle;

	public Timone(Integer angle){
		this.angle = angle;
	}
	
	public Integer getAngle(){
		return this.angle;
	}
	
	public void imposta(Integer angle){
		this.angle = angle;
	}
	
	@Override
	public boolean equals(Object obj){
		
		if(this == obj) return true;
		if(!(obj instanceof Timone)) return false;
		
		Timone t = (Timone)obj;
		if( this.getAngle() == t.getAngle()) return true;
	
		return false;
	}
	
	@Override
	public String toString(){
	
		String toReturn = this.angle.toString();
		
		if(toReturn.equals("0")) 		return "0 NORD";
		if(toReturn.equals("90"))		return "90 EST";
		if(toReturn.equals("180"))  return "180 SUD";
		if(toReturn.equals("270"))	return "270 OVEST";
	
	return toReturn;
	}
	
}

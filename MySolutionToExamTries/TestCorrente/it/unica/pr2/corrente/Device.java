package it.unica.pr2.corrente;

import java.util.*;

public abstract class Device extends ArrayList<Device>{
	
	public int watt;
	
	public Device(Integer watt){
		this.watt = watt;
	}
	
	public boolean isInput(){
		return (this instanceof InputDevice);
	}
	
	public boolean isOutput(){
		return (this instanceof OutputDevice);
	}

	public String toString(){
		return (this.watt + " " +this.getClass().getSimpleName());
	}

}

package it.unica.pr2.services;

import java.util.*;


public class SquareRoot extends Service {


	public SquareRoot(){
	}
	
	static public Service getService(){
		return new SquareRoot();
	}
	
	@Override
	public String toString(){
		return "square root";
	}
	
	

}


package it.unica.pr2.services;

import java.util.*;
import java.lang.Math;

public class DoubleInt extends Service {


	public DoubleInt(){
	}
	
	static public Service getService(){
		return new DoubleInt();
	}
	
	@Override
	public String toString(){
		return "double int";
	}



}


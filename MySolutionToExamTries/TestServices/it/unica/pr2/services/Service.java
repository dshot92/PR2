package it.unica.pr2.services;

import java.util.*;

public class Service {

	public Object execute(Object num){
	
	if(num instanceof Integer){
		Integer n = (Integer)(num);
		n *= 2;
		return (Object)n;
	}
	
	if(num instanceof Double){
		Double n = (Double)num;
		return (Object)Math.sqrt(n);
	}
		return null;
	}
}

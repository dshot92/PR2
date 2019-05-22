package it.unica.pr2.stream;

import java.util.List;
import java.util.stream.Collectors;


public class MyStream {

	public MyStream (){
	
	}
	
	public List<String> upperCase(List<String> l){
	
		return l.stream().map(String::toUpperCase).collect(Collectors.toList());
	
	}
	
	public List<String> atMost4Characters(List<String> l){
	
	return l.stream().filter(s -> s.length() <= 4).collect(Collectors.toList()); 
	
	}
	
	public Integer sum(List<Integer> l){
	
	 //return l.stream().reduce(0,(a, b) -> a+b);
	 return l.stream().mapToInt(Integer::intValue).sum();
	
	}
	

}

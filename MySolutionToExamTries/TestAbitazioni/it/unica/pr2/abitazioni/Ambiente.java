package it.unica.pr2.abitazioni;

import java.lang.*;
import java.util.*;

 
public class Ambiente implements Comparable<Ambiente>{

	private Integer metri;

	public Ambiente(Integer metri){
		this.metri = metri;
	}

	public Integer getMetri(){
		return this.metri;
	}
	
	public Integer getSuperficie(){
		return this.metri;
	}
	
	public Integer superfice(){
		return this.metri;
	}

	@Override
	public int compareTo(Ambiente other){
		return (this.getMetri().compareTo(other.getMetri()));
	}

	public String toString(){
		return "Questo ambiente occupa " + this.metri + "mq";
	}
	
}

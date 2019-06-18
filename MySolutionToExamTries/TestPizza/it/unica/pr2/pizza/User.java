package it.unica.pr2.pizza;

import java.util.*;

public class User extends HashSet{
	
	static int serial = 0;
	
	int id = ++User.serial;

	private String email;
	
		public User(){

	
	}
	
	public User(String email){
		this.email = email;
	
	}
	
	public String email(){
		return this.email;
	}
	
	public int id(){
		return this.id;
	}
	
	static public HashSet<User> set(User[] set){
		HashSet aux = new HashSet();
		
		for(User u : set) 
			aux.add(u);
	
		return aux;
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj) return true;
		if( !(obj instanceof User) ) return false;
		User u = (User)obj;
		if( this.email().equals(u.email()) ) return true;
		
		return false;
	}
	
	@Override
	public boolean add(Object u){
		for(Object usr : this){
			if(usr instanceof Cliente){
				if( !(usr.equals(u)) )
					this.add(u);
			}
		}
		return true;
	
	}


}

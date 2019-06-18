package it.unica.pr2.processi; // stuff must be here

import java.util.*;

public class Task extends ArrayList<Task>{

	private String descrizione;

	public Task(){
		this.descrizione = "Task di avvio procedura";
		this.add(new OpeningTask());
		this.add(new SendingTask());
		this.add(new EndingTask());
	}

	public Task(String descrizione){
		this.descrizione = descrizione;
	}
	
	public String getDescrizione(){
		return this.descrizione;
	}
	
	@Override
	public String toString(){
		return this.descrizione;
	}


}

package it.unica.pr2.biblioteca;

import it.unica.pr2.biblioteca.libreria.Libro;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Iterator;

public class Biblioteca extends ArrayList<Libro> {

	private String nessun_libro;
	private int num_libri;

	public Biblioteca(Libro[] list){
		if( list.length == 0){
			this.num_libri = 0;
			this.nessun_libro = "Nessun libro presente.";
		}else{
			for (Libro l : list){
				this.add(l);
				num_libri++;
			}
		}
	}

	@Override
	public String toString(){
		if(num_libri == 0){
			return this.nessun_libro;
		}else{
			Iterator<Libro> LibriIterator = this.iterator();
			String answer = "";

			while (LibriIterator.hasNext()) {
				answer = answer + (LibriIterator.next().toString());
			}
			answer = answer.substring( 0, (answer.length())-2);
			answer += ".";
			System.out.println(answer);
			return answer;
		}
	}

	public int pagine(){
		return this.stream().mapToInt(Libro::getPag).sum();
	}
}

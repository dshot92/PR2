package it.unica.pr2.biblioteca.eccezioni;

import java.lang.Exception;

public class LibroNonValidoException extends RuntimeException {

	public LibroNonValidoException(String error){
		System.out.println("Libro Exception - " + error);
	}

}

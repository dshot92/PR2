package it.unica.pr2.ricercatori;

import java.util.*;
import java.lang.*;

public class AutoreMancante extends RuntimeException{
public Ricercatore autoreMancante;

	public AutoreMancante(Ricercatore autoreMancante){
		this.autoreMancante = autoreMancante;
	}

}

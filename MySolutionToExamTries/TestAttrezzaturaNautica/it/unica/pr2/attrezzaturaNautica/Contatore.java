package it.unica.pr2.attrezzaturaNautica;

import java.util.*;

public class Contatore {

	public static final Contatore CONTATORE = new Contatore(0);

	public int n;
	public int last;

	public Contatore(int n){
		this.n = n;
		this.last = n;
	}

}

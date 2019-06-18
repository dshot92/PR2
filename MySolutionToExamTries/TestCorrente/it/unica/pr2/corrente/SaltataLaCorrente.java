package it.unica.pr2.corrente;

import java.lang.*;
import it.unica.pr2.corrente.*;
import it.unica.pr2.corrente.devices.*;

public class SaltataLaCorrente extends RuntimeException {

	public SaltataLaCorrente(){
		
		PresaElettrica.status = false;
	
	}

}



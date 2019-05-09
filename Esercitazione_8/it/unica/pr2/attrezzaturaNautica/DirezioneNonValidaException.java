package it.unica.pr2.attrezzaturaNautica;
import java.lang.*;

public class DirezioneNonValidaException extends RuntimeException {

 	Integer error;

public DirezioneNonValidaException(Integer a){
	error = a;
}

	public String stampaCausa(){
   		 return ("Direzione " + error.toString() +  " non valida. La direzione deve essere un valore nell'intervallo [0,360]");
 	 }
}

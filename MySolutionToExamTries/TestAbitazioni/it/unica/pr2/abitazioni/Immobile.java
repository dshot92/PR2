package it.unica.pr2.abitazioni;

import it.unica.pr2.abitazioni.*;
import java.util.*;

public class Immobile extends ArrayList<Ambiente>{

    public Integer superficie(){

        Integer somma=0;

        for(Ambiente amb : this)
                somma+= amb.getMetri();
        return somma;

    }


	public boolean bilocale(){
	
	boolean bilocale = true;
	
	int cameraLetto = 0;
	int bagno = 0;
	int cucina = 0;
	
	for(Ambiente amb : this){
				if(amb instanceof CameraDaLetto && cameraLetto <=1){
				 bilocale = true;     
        	++cameraLetto;
        }else bilocale = false;
        if(amb instanceof Cucina && cucina <=1){
         bilocale = true;     
        	++cucina;
        }else bilocale = false;
        if(amb instanceof Bagno && bagno <=1){ 
        bilocale = true;     
        ++bagno;
        }else bilocale = false;
        }
        return bilocale;
	}
	
	
	
	

}

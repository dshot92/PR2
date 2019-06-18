package it.unica.pr2.attrezzaturaNautica;

import java.util.*;

public class DirezioneListener {

    
    public Contatore conta;
    
    public DirezioneListener(Contatore conta){
        
        this.conta=conta;
    }
    
    abstract public void direzioneCambiata(int nuovaDirezione);
}

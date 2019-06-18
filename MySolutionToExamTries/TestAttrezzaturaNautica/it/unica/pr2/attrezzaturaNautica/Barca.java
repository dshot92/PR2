package it.unica.pr2.attrezzaturaNautica;

import java.util.*;

public class Barca extends HashSet<AttrezzaturaNautica>{

	public static Barca barca = new Barca();

	public Timone timone;
	
	public Barca(){

	}
	
	public static Barca getBarca(){
		return barca;
	}
	
	public void setTimone(Timone t){
		if(!this.isEmpty()){
			for(Object o : this){
				if(o instanceof Timone){
					this.remove(o);
				}
			}
		}
		this.timone = t;
		this.add(t);
	}
	
	public Integer direzioneAttuale(){
		return this.timone.getAngle();
	}

	public void setDirezioneListener(DirezioneListener listener){


	}

}

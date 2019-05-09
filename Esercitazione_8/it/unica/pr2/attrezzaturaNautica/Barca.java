package it.unica.pr2.attrezzaturaNautica;
import java.util.HashSet;

public class Barca extends HashSet<AttrezzaturaNautica>{

	public Barca (){

	}

	public void setTimone(Timone t){
		this.add(t);
	}
	
	public int direzioneAttuale(){
	if(this.size() > 0){
	
		if(this.size() > 1)
			this.remove(this.iterator().next());

		return ((Timone)this.iterator().next()).angle;
	}
	else{
		return 0;
		}
	}

}

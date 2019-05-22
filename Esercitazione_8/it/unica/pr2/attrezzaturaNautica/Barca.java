package it.unica.pr2.attrezzaturaNautica;
import java.util.HashSet;

public class Barca extends HashSet<AttrezzaturaNautica>{

	public Barca (){
	}

	public Barca getBarca(){
		// solution for old 30 in the Test
		if (instance == null){
			instance = new Barca();
			return instance;
		}
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

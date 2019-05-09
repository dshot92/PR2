package it.unica.pr2.attrezzaturaNautica;

public class Timone extends AttrezzaturaNautica {

	int angle;
	static int totaleTimoni = 0;
	static int direzioniCambiate = 0;

	public Timone (int angle){
		this.angle = angle;
		totaleTimoni++;
	}

	public void imposta(int angle){
		if( angle < 0 || angle > 360)
			throw new DirezioneNonValidaException(angle);
	
		this.angle = angle;
		direzioniCambiate++;
		
	}
	
	@Override
	public boolean equals(Object o){
	
	if( this == o ) 
		return true;
		
	if( this == null ) 
		return false;
	
	if( !( o instanceof Timone ) ) 
		return false;
		
	Timone other = (Timone) o;
	
	if (this.angle == other.angle) 
		return true;
	else 
		return false;
	}
	
	@Override
	public String toString(){
	
	if(this.angle == (0)  ) return ( this.angle + " NORD" );
	if(this.angle == (90) ) return ( this.angle + " EST"  );
	if(this.angle == (180)) return ( this.angle + " SUD"  );
	if(this.angle == (270)) return ( this.angle + " OVEST");
	
	return ( this.angle + "");
	
	}
	
	

}

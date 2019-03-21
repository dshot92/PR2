public class Persona{

	private int eta;
	private String nome, cognome;
	
	public Persona(String nome, String cognome, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;		
	}
	
	public int getEta(){
		return this.eta;
	}
	
	

	public boolean equals(Object obj){
	
		//If the cell is the same one, the two are equals
		if (this == obj) return true;

		// If obect point to null, surely the the are NOT equals
		if( obj == null) return false;
		
		if( ! ( obj instanceof Persona ) ) return false;

		Persona other = (Persona) obj;

		if(this.eta != other.eta) return false;
		
		if ( nome == null){
		
			if( other.nome != null)
					return false;
		}else if ( !nome.equals(other.name)
				return false;


		return true;
	
	}


}

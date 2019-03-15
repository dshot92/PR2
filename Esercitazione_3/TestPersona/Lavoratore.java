public class Lavoratore extends Persona{
	
	private int stipendio;
	
	public Lavoratore(String nome, String cognome, int eta){
		super(nome, cognome, eta);
		this.stipendio = 100;
	}
	
	public Lavoratore(String nome, String cognome, int eta, int stipendio){
		super(nome, cognome, eta);
		if(stipendio < 100){
			this.stipendio = 100;
		}else{
			this.stipendio = stipendio;
		}
	}
	
	public int getStipendio(){
		return this.stipendio;
	}
	
	public void incrementaStipendio(int perc){
		if(perc >= 0){
			this.stipendio += ((perc * this.stipendio)/(100));
		}
	}
}

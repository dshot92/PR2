public class RegistrazioneAudio extends ElementoMultimediale implements Audio{
	
	private int volume;
	private int durata;
	private Estensioni.EstensioniAudio estensione;

	public RegistrazioneAudio(String titolo, Estensioni.EstensioniAudio estensione){
		super(titolo);
		this.volume = 5;
		this.durata = 5;
		this.estensione = estensione;
	}

	public void play(){
		int i, j;
		for(i=0; i<this.durata; i++){
			System.out.println(getTitolo());
			for(j=0; j<this.volume; j++){
				System.out.print("!");
			}
		}
	}

	@Override
	public void esegui(){
		this.play();
	}

	@Override
	public void weaker(){
		if(this.volume > 0) this.volume --;
	}

	@Override
	public void louder(){
		if(this.volume < 10) this.volume ++;
	}
}

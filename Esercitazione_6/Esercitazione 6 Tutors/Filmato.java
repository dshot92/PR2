public class Filmato extends ElementoMultimediale implements Audio, Video{
	
	private int luminosita;
	private int volume;
	private int durata;
    private Estensioni.EstensioniFilmato estensione;

	public Filmato(String titolo, Estensioni.EstensioniFilmato estensione){
		super(titolo);
		this.volume = 5;
		this.durata = 5;
		this.luminosita = 5;
        this.estensione = estensione;
	}

	public void play(){
		int i, j;
		for(i=0; i<this.durata; i++){
			System.out.println(getTitolo());
			for(j=0; j<this.volume; j++){
				System.out.print("!");
			}
			for(j=0; j<this.luminosita; j++){
				System.out.print("*");
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
		if(this.volume < 20) this.volume ++;
	}


	@Override
	public void brighter(){
		if(this.luminosita < 20) this.luminosita ++;
	}


	@Override
	public void darker(){
		if(this.luminosita > 0) this.luminosita --;
	}
}

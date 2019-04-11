public class Immagine extends ElementoMultimediale implements Video{
	
	private int luminosita;
    private Estensioni.EstensioniImmagine estensione;

	public Immagine(String titolo, Estensioni.EstensioniImmagine estensione){
		super(titolo);
		this.luminosita = 5;
        this.estensione = estensione;
	}

	public void show(){
		int i;

		System.out.println(getTitolo());
		for(i=0; i<this.luminosita; i++){
			System.out.print("*");
		}
	}

	@Override
	public void esegui(){
		this.show();
	}

	@Override
	public void brighter(){
		if(this.luminosita < 10) luminosita ++;
	}

	@Override
	public void darker(){
		if(this.luminosita > 0) luminosita --;
	}
}

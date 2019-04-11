public class LettoreMultimediale {

	public static void main(String[] args){

		final int DIM=10;

		ElementoMultimediale[] lettore = new ElementoMultimediale[DIM];

		lettore[0] = new Immagine("i1", Estensioni.EstensioniImmagine.JPG);
		lettore[1] = new Immagine("i2", Estensioni.EstensioniImmagine.PNG);
		lettore[2] = new Immagine("i3", Estensioni.EstensioniImmagine.TIFF);
		lettore[3] = new RegistrazioneAudio("r1", Estensioni.EstensioniAudio.WAV);
		lettore[4] = new RegistrazioneAudio("r2", Estensioni.EstensioniAudio.MP3);
		lettore[5] = new RegistrazioneAudio("r3", Estensioni.EstensioniAudio.MIDI);
		lettore[6] = new Filmato("f1", Estensioni.EstensioniFilmato.AVI);
		lettore[7] = new Filmato("f2", Estensioni.EstensioniFilmato.FLV);
		lettore[8] = new Filmato("f3", Estensioni.EstensioniFilmato.MP4);
		lettore[9] = new Filmato("f4", Estensioni.EstensioniFilmato.WEBM);


		for (int i = 0; i < DIM ; i++){
			lettore[i].esegui();
		}
	}
}

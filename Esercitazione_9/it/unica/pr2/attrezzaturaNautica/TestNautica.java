// svolgere in 90 min.


package it.unica.pr2.attrezzaturaNautica;
import java.util.Set;

public class TestNautica {

	public static void main(String[] args) {
	
		// 15
		Barca miaBarca = new Barca(); 
		Set<AttrezzaturaNautica> miaBarcaSet = miaBarca;

		// 18
		assert miaBarca.size() == 0;
		Timone timone = new Timone(90);  
		assert timone instanceof AttrezzaturaNautica;
		miaBarca.setTimone(timone); 
		assert miaBarca.size() == 1;

		// 20
		assert miaBarca.direzioneAttuale() == 90;   // Se la barca non ha alcun timone, la direzione attuale deve essere 0
	
		// 22
		timone.imposta(120);  // cambia direzione
		assert miaBarca.direzioneAttuale() == 120;

		// 25
		Timone altroTimone = new Timone(120);   // Due timoni sono uguali se hanno la stessa direzione impostata
		assert timone.equals(altroTimone);
		altroTimone.imposta(90);
		assert timone.equals(altroTimone) == false;
		miaBarca.setTimone(altroTimone);
		assert miaBarca.direzioneAttuale() == 90;        

		// 27
		assert (timone + "").equals("120"); 
		assert (altroTimone + "").equals("90 EST"); // caso speciale: 0=NORD; 90=EST; 180=SUD; 270=OVEST

        // La barca ha sempre un solo timone, l'aggiunta di un nuovo timone implica la rimozione del vecchio.
        assert miaBarca.size() == 1;
        assert miaBarca.contains(altroTimone);
        assert !miaBarca.contains(timone);

        // 28
        try{
            // La direzione deve essere un valore nell'intervallo [0,360]
            altroTimone.imposta(-1);
            assert false;
            
        } catch(DirezioneNonValidaException e){
            assert e.stampaCausa().equals("Direzione -1 non valida. La direzione deve essere un valore nell'intervallo [0,360]");
            // ok
     
        }
		
		// 30
		assert timone.totaleTimoni == 2;
        assert timone.direzioniCambiate == 2;

	}
	
}


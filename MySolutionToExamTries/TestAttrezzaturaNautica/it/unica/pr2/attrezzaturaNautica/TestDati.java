//due in 90 min.

package it.unica.pr2.attrezzaturaNautica;

import java.util.Set;


public class TestDati {

	public static void main(String[] args) {
	
		// 15
		Barca miaBarca = Barca.getBarca(); 
		Set<AttrezzaturaNautica> miaBarcaSet = miaBarca;

		// 18
		assert miaBarca.size() == 0;
		Timone timone = new Timone(90);  
		assert timone instanceof AttrezzaturaNautica;
		miaBarca.setTimone(timone); 
		assert miaBarca.size() == 1;

		
		// 20
		assert miaBarca.direzioneAttuale() == 90;

		// 22
		timone.imposta(120);  // cambia direzione
		assert miaBarca.direzioneAttuale() == 120;

		// 25
		Timone altroTimone = new Timone(120);
		assert timone.equals(altroTimone);
		altroTimone.imposta(90);
		assert timone.equals(altroTimone) == false;
		miaBarca.setTimone(altroTimone);
		assert miaBarca.direzioneAttuale() == 90;
	
		// 27
		assert (timone + "").equals("120"); 
		assert (altroTimone + "").equals("90 EST"); // caso speciale: 0=NORD; 90=EST; 180=SUD; 270=OVEST

		assert miaBarca.size() == 1;
		assert miaBarca.contains(altroTimone);
		assert !miaBarca.contains(timone);
		
		// 28
		Contatore conta = Contatore.CONTATORE;
		assert conta.n == 0;
		assert conta.last == 0;

		// 30
		miaBarca.setDirezioneListener(new DirezioneListener(conta){
			public void direzioneCambiata(int nuovaDirezione) {
				this.conta.n++;
				this.conta.last = nuovaDirezione;
			}
		
		}); 
/*
		// 30+
		altroTimone.imposta(270);  // cambia direzione
		assert conta.n == 1;

		altroTimone.imposta(180);  // cambia direzione
		
		assert conta.n == 2;
		assert conta.last == 180;

	*/
        System.out.println("Ok funziona");
	}
	
}


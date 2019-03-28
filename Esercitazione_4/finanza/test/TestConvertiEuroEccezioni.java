package finanza.test;

import finanza.ConvertiEuro;
import finanza.Valuta;
import finanza.eccezioni.ConvertitoreOverflowException;
import finanza.eccezioni.ValutaNonTrovataException;

/**
* Un altro test per la classe ConvertiEuro.
* @author Livio Pompianu, Simone Porcu
*/
public class TestConvertiEuroEccezioni {

	public static void main(String[] args){
		double valore;

		// Convertitore per massimo 5 valute
		ConvertiEuro mioConvertitore = new ConvertiEuro(5);
		// Crea 4 nuove valute.
		Valuta yen = new Valuta("Yen Giapponese", "Yen", 126.83, 1);
		Valuta usd = new Valuta("Dollaro statunitense", "USD", 1.14, 61);
		Valuta brl = new Valuta("Real brasiliano", "BRL", 4.11, 1);
		Valuta cad = new Valuta("Dollaro canadese", "CAD", 1.48, 1);
		Valuta sek = new Valuta("Corona svedese", "SEK", 10.43, 1);
		Valuta chf = new Valuta("Franco svizzero", "CHF", 1.12, 1);

		// Imposta i tassi di scambio
		mioConvertitore.impostaValuta(yen);
		mioConvertitore.impostaValuta(usd);
		mioConvertitore.impostaValuta(brl);
		mioConvertitore.impostaValuta(cad);
		mioConvertitore.impostaValuta(sek);

		try{
			mioConvertitore.impostaValuta(chf);
			assert false; // Se l'eccezione è gestita correttamente questa istruzione non viene eseguita

		} catch(ConvertitoreOverflowException e){
			System.out.println("\n[TestConvertiEuroEccezioni: catch] ConvertitoreOverflowException gestita correttamente!");
		}


		// Stampa del convertitore
		String stampa = mioConvertitore.toString();
		System.out.println(mioConvertitore);
		assert stampa.equals("[(Yen, 126.83), (USD, 1.14), (BRL, 4.11), (CAD, 1.48), (SEK, 10.43)]");

		// Tentativo di conversione.
		try{
			valore = mioConvertitore.converti(50.00, usd);
			assert (valore > 56.9) && (valore < 57);
			System.out.println("\n50.00 euro corrispondono a " + valore + " dollari.");

			valore = mioConvertitore.converti(50.00, chf);

			// Se l'eccezione è stata gestita correttamente, le seguenti 2 righe di codice non verranno eseguite.
			System.out.println("50.00 euro corrispondono a " + valore + " franchi svizzeri.");
			assert false;

		}catch(ValutaNonTrovataException e){

			// Se l'eccezione è stata gestita correttamente, verranno eseguite sia la seguente riga di codice che le istruzioni fuori dal catch.
			System.out.println("\n[TestConvertiEuroEccezioni: catch] In caso di errore posso eseguire istruzioni aggiuntive.");

			// Rimuovendo il commento dalla seguente istruzione return, saranno eseguite anche le istruzioni del finally?
			//return;
		}
		finally{
			System.out.println("\n[TestConvertiEuroEccezioni: finally] Le istruzioni del finally sono eseguite in ogni caso");
		}

		// Costruisci un nuovo convertitore che è uguale a mioConvertitore
		ConvertiEuro convertitore2 = new ConvertiEuro(6);
		convertitore2.impostaValuta(yen);
		convertitore2.impostaValuta(usd);
		convertitore2.impostaValuta(brl);
		convertitore2.impostaValuta(cad);
		convertitore2.impostaValuta(sek);
		assert mioConvertitore.equals(convertitore2);


		// Costruisci un nuovo convertitore che è diverso da mioConvertitore
		ConvertiEuro convertitore3 = new ConvertiEuro(6);
		convertitore3.impostaValuta(yen);
		convertitore3.impostaValuta(usd);
		convertitore3.impostaValuta(brl);
		convertitore3.impostaValuta(sek);
		convertitore3.impostaValuta(cad);
		assert !mioConvertitore.equals(convertitore3);

		System.out.println("\n[TestConvertiEuroEccezioni: fine main] L'applicazione non si e' chiusa in modo anomalo: posso continuare ad eseguire istruzioni.");

		// L'esecuzione del metodo pericoloso fuori dal blocco try suggerisce che l'eccezione lanciata è un'istanza di RuntimeException.
		System.out.println("Ok!");
		/* ---------------------------
		--------------------------- */
	}

}

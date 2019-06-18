/*
	ATTENZIONE:

	usare javac -Werror -Xlint:unchecked  per accertarsi che non ci siano problemi coi tipi generici
	usare java -ea  per verificare le assert
*/
		
package it.unica.pr2.pubblicazioni.test;

import it.unica.pr2.ricercatori.*; // tutte le classi o interfacce richieste vanno qui

public class TestPubblicazioni {

    public static void main(String[] args) {
        // classe per valutare i ricercatori

// 18
        Ricercatore atzori = new Ricercatore("Maurizio", "Atzori");

        assert atzori.pubblicazioni().size() == 0;
        atzori.pubblicazioni().add((Articolo) new Journal("Natural Language Understanding")); // titolo; si assume che l'articolo sia scritto dal solo ricercatore atzori
        assert atzori.pubblicazioni().size() == 1;

// 20
        assert atzori.pubblicazioni().get(0) instanceof Articolo;
        assert atzori.pubblicazioni().get(0).equals(new Journal("Natural Language Understanding"));
//24 

// articolo a due nomi
        atzori.pubblicazioni().add(new Journal("Toward Collaboration",
                atzori, new Ricercatore("Massimo", "Bartoletti")));

// articolo a quattro nomi
        atzori.pubblicazioni().add(new Journal("Toward Collaboration Follow Up",
                new Ricercatore("Massimo", "Bartoletti"), atzori,
                new Ricercatore("Terzo", "Autore"),
                new Ricercatore("Quarto", "Autore")
        ));
	System.out.println(atzori.pubblicazioni().get(0).getClass().getSimpleName());
	System.out.println(atzori.pubblicazioni().get(0).numeroAutori());
      //  assert atzori.pubblicazioni().get(0).numeroAutori() == 1;
      //  assert atzori.pubblicazioni().get(2).numeroAutori() == 4;

//27
        try {

            // pubblicazione non scritta da atzori
            atzori.pubblicazioni().add(new Journal("altro articolo", new Ricercatore("Massimo", "Bartoletti")));
            assert false;

        } catch (AutoreMancante e) {
            assert e.autoreMancante.equals(atzori);
        }

        // pubblicazione non scritta da atzori
        Ricercatore bartoletti = new Ricercatore("Massimo", "Bartoletti");

        try {

            bartoletti.pubblicazioni().add(new Journal("ancora un articolo", atzori));
            assert false;

        } catch (AutoreMancante e) {
            assert e.autoreMancante.equals(bartoletti);
        }
/*
//30
        // in questo punteggio ogni articolo (pubblicazione) vale 1.0, quindi coincide col numero di articoli
        // niente da implementare, solo comprendere
        Double punteggioPubblicazioniNonPesato = atzori.pubblicazioni().stream()
                .mapToDouble(articolo -> 1.0)
                .sum();
        assert punteggioPubblicazioniNonPesato == atzori.pubblicazioni().size();

        // richiede implementazione
        Double punteggioPubblicazioniPesatoPerNumeroAutori = atzori.pubblicazioni().stream()
                .mapToDouble(Articolo::pesoInversamenteProporzionaleAdAutori)
                .sum();
        

        assert punteggioPubblicazioniPesatoPerNumeroAutori
                == 1.0 // articolo scritto da solo 
                + 1.0 / 2 // articolo scritto in due (pesa la meta')
                + 1.0 / 4; // l'ultimo articolo inserito e' scritto da 4 autori, quindi pesa un quarto
	*/
	System.out.println("Everything OK");
    }

}

/*

	Esercitazione di prova: prova a fini didattici, non sara' valutata

	Consegna1:
	E' necessario consegnare un file "cognome_nome_matricola_risorseWeb_assert.tar.gz" (o ".zip") che contenga
    solo i file .java funzionanti nelle cartelle opportune in base al package. 
	(la prima directory contenuta dovra essere "it"). 

	Consegna2:
	E' necessario consegnare la prova precedente con file "cognome_nome_matricola_risorseWeb_JUNIT.tar.gz" (o ".zip") che contenga
    gli stessi file di consegna1 ed inoltre il file TestRisorseWeb.java modificato
	in modo da utilizzare JUNIT anziche' gli assert di Java.
	
	Note:
	Per lo sviluppo e' possibile commentare le righe o i test non ancora implementati 
	(ad esempio commentare tutte le righe dopo il Test 1).
	I file consegnati non verranno presi in considerazione se non compilano o non superano nessun test.
	I test vanno risolti SEQUENZIALMENTE (dal primo all'ultimo, senza salti).
	Utilizzare i commenti per ignorare i test successivi che ancora non compilano.


*/
package it.unica.pr2.risorseWeb.test;

import it.unica.pr2.risorseWeb.*; // tutte le classi/interfacce vanno qui
import java.util.*;

public class TestRisorseWeb {

	public static void main(String[] args) {

		// 18
		RisorsaWeb p = new PaginaWeb("index.html","<html><body>main</body></html>"); // nome, contenuto
		java.io.File f = new FileWeb("pippo.txt","Questo e' il contenuto\ndi un file di testo."); // nome, contenuto (NON salva su disco)
		assert f instanceof RisorsaWeb;

		//23
		Set<RisorsaWeb> set = new HashSet<RisorsaWeb>();
		set.add(p);
		set.add((RisorsaWeb) f);
		set.add(new PaginaWeb("altraPagina.html","<html><body>altro</body></html>") );

		List<RisorsaWeb> list = Ordina.perCriterioUtente(set, 
        (RisorsaWeb a, RisorsaWeb b) -> a.getNome().compareTo(b.getNome()) ); 
		assert list.get(0).getNome().equals("altraPagina.html");
		assert list.get(1).getNome().equals("index.html");
		assert list.get(2).getNome().equals("pippo.txt");

		//26	
        list = Ordina.perLunghezzaContenuto(set); // hint: utilizza getContenuto() di RisorsaWeb
		assert list.get(0).equals(p);
		assert list.get(2).equals(f);

		//28
		assert list.get(0).equals(new PaginaWeb("index.html","<html><body>main</body></html>"));
		assert list.get(1).equals(new PaginaWeb("altraPagina.html","<html><body>altro</body></html>") );

		//30
		FileWeb file = new FileWeb("pippo.txt","Questo e' il contenuto\ndi un file di testo.");
		
         System.out.println(file.getContenuto());
        
        
        file.salva(); // salva su disco il file "pippo.txt" col contenuto specificato
		FileWeb file2 = new FileWeb("pippo.txt"); // legge il contenuto dal file pippo.txt su disco
		
        //System.out.println(file.getContenuto());
        
        //System.out.println(file2.getContenuto());
        
        assert file.getContenuto().equals(file2.getContenuto());
        
        /**/
        System.out.println("ok assert passato");
        
	}
}


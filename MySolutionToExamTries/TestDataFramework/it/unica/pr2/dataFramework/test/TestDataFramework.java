/*
	Rispondere alle domande e superare la classe di test.

	Tempo TOTALE (domande+test) a disponibile: 80 minuti.

	E' obbligatorio utilizzare linux, gedit, e jdk da riga di comando.
	E' possibile utilizzare la documentazione online di Java, se disponibile.


	ATTENZIONE:

	1) per questo compito ignorare i messaggi di warning (dovuti al non utilizzo dei Generics)
	2) usare java -ea  per verificare le assert


	DOMANDE
	Rispondere scrivendo all'inizio della domanda (inizio riga) il carattere V (vero) o F (falso).

	1.f Il cast è una operazione che compila sempre ma puo' dare eccezioni a tempo di esecuzione
	2.f Se a.hashCode() == b.hashCode() allora a.equals(b) == true
	3.f I valori degli attributi private possono essere modificati da piu' oggetti.
	4.v Il linguaggio Java permette di programmare in maniera non object-oriented
	5.f In Java per fare operazioni matematiche devo creare un oggetto di tipo Math ed utilizzare i suoi metodi (ad esempio sqrt)
	6.f il codice "A a = new B();" implica che A è una superclasse di B
	7.v static è una parola chiave che si puo' utilizzare per la firma di metodi, attributi e classi
	8.f l'interprete Java esegue il codice sorgente nei file .java in codice macchina
	9.f Una interfaccia anonima è una interfaccia Java senza il nome
	10.f In Java, le classi implementano tutti i metodi che dichiarano
	11.f La Java Virtual Machine esegue solo programmi bytecode scritti in Java
	12.v il codice "super();" si riferisce sempre al costruttore della superclasse senza parametri
	13.v La parola chiave final puo' essere usata nella firma di un metodo, nella dichiarazione di una classe e come modificatore di un attributo, con significati diversi.
	14.v Gli stream Java servono ad elaborare collezioni di dati utilizzando un approccio funzionale
	15.f La classe java.io.Directory serve a rappresentare cartelle su disco
*/


package it.unica.pr2.dataFramework.test;

import it.unica.pr2.dataFramework.*; // put everything here

import static java.util.Arrays.asList;
import java.util.*;



public class TestDataFramework {
	public static void main(String[] args) {

		// 18

		Tabella t = new Tabella();
		List r1 = new Riga();
		r1.add("marco carta"); // nome e cognome
		r1.add(35); // eta
		r1.add("cagliari"); // luogo di nascita

		Riga r2 = new Riga();
		r2.add("mario rossi");
		r2.add(51);
		r2.add("roma");

		t.add(r1);
		t.add(r2);

		assert t.rows() == 2;
		assert r2 instanceof ArrayList;

		// 23

		assert t.columns() == 3;

		List l = asList("giuseppe garibaldi", 31, "nizza");
		Riga r3 = new Riga(l);

		// 25
		t.setHeaders(asList("Nome e Cognome","Eta","Luogo di nascita"));
		assert t.size() == 2;  // number of rows
	
		List eta = t.getColumn("Eta");
		assert eta.get(1).equals(new Integer(51));

		// 27
		t.add(r3);		
		double n = t.getAverage("Eta");
		assert n == (35+ 51+ 31) /3.0;

		
		// 30
		try {
			n = t.getAverage("Colonna inesistente");
			System.out.println(n);
            assert false;
		} catch(ColumnException e) {
			assert true;
		}

		try {
			n = t.getAverage("Luogo di nascita");
			assert false;
		} catch(ColumnException e) {
			assert true;
        }
        
        
        System.out.println("Ok passato");
    }
}

package it.unica.pr2.biblioteca.test;


import java.util.Collections;
import java.util.List;
import it.unica.pr2.biblioteca.eccezioni.LibroNonValidoException;
import it.unica.pr2.biblioteca.libreria.Libro;
import it.unica.pr2.biblioteca.Biblioteca;


public class TestLibri {

	public static void main(String[] args) {
		// suggerimento: sfruttare ArrayList e l'ereditarieta' (utile nei prossimi test)
		Libro javabook = new Libro("Learn Java",150); 	// nome libro, pagine
		Libro cbook = new Libro("Tutto in C",120);		// nome libro, pagine
		Libro[] libri = new Libro[] {javabook, cbook}; 	// crea array di 2 elementi equivalente a libri[0] = javabook; libri[1] = cbook;
		Biblioteca bibliotecaInformatica = new Biblioteca(libri);
		assert bibliotecaInformatica.pagine() == 270;


		try {
			Libro x = new Libro("molto leggero",-5);
			assert false; // Un libro non può avere pagine negative
		}catch(LibroNonValidoException e) {
			// ok
		}
		// suggerimento: avete sfruttato ArrayList e l'ereditarieta'??
		List<Libro> libriInformatica = bibliotecaInformatica;
		assert libriInformatica.size() == 2;
		assert libriInformatica.get(0) == javabook;
		assert libriInformatica.get(1) == cbook;

		System.out.println("ok");
		// Ordina i libri in base al numero di pagine (dal piu' piccolo al piu' grande); funziona come Arrays.sort ma per le liste
		Collections.sort(libriInformatica);

		assert libriInformatica.get(0) == cbook;
		assert libriInformatica.get(1) == javabook;

		Libro pr2book = new Libro("Programmazione in Java", 536);

		// Due Libri sono uguali se hanno stesso nome e numero di pagine
		assert !javabook.equals(pr2book);
		assert !javabook.equals(new Libro("Learn Java",149));
		assert javabook.equals(new Libro("Learn Java",150));

		Biblioteca bibliotecaVuota = new Biblioteca(new Libro[0]);				// Nuova biblioteca senza libri.
		assert bibliotecaVuota.toString().equals("Nessun libro presente.");

		Libro[] libriC = new Libro[] {cbook};
		Biblioteca bibliotecaC = new Biblioteca(libriC);						// Biblioteca con un solo libro.
		assert bibliotecaC.toString().equals("Tutto in C: 120.");


		Libro[] altriLibri = new Libro[] {javabook, cbook, pr2book};
		Biblioteca altrabiblioteca = new Biblioteca(altriLibri);	// Biblioteca con n libri.
		assert altrabiblioteca.toString().equals("Learn Java: 150; Tutto in C: 120; Programmazione in Java: 536.");

	}
}

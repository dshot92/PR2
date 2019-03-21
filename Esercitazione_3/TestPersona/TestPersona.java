/*

	ESERCITAZIONE

	compile: 	javac <nome file test>
	run:		java <nome classe test>

	Consegna:
	E' necessario consegnare un file "matricola_cognome_nome.tar.gz" (o ".zip") 
	che contenga i file .java all'interno dei relativi package. 

	Per lo sviluppo e' possibile commentare le righe non ancora implementate 
    (ad esempio commentare tutte le righe dopo il Test 1).

*/


public class TestPersona {
	public static void main(String[] args) {

		// Test 1: Test sui costruttori
		Persona persona = new Persona("Mario", "Rossi", 20);                // Nome, Cognome, Eta

        Lavoratore pagato = new Lavoratore("Carlo", "Verdi", 50);  // Nome, Cognome, Eta

		Lavoratore sottopagato = new Lavoratore("Bruno", "Neri", 21, 20);  // Nome, Cognome, Eta, Stipendio

        
        
		// Test 2: Metodi get Persona
		assert persona.getEta() == 20;
    
		// Test 3: Metodi get Lavoratore
        assert pagato.getStipendio() == 100;
		assert sottopagato.getStipendio() == 100;
        assert sottopagato.getEta() == 21;
        
		// Test 3: Metodo incrementa stipendio
		sottopagato.incrementaStipendio(10); // Incrementa lo stipendio del 10%
		assert sottopagato.getStipendio() == 110;

        // Test 4: Metodo incrementa stipendio
        sottopagato.incrementaStipendio(-10); // Non modifica lo stipendio.
		assert sottopagato.getStipendio() == 110;


		Persona p1 = new Persona("Mario", "Rossi", 21);
		Persona p2 = new Persona("Mario", "Rossi", 21);

		assert p1.equals(p2);
        
		System.out.println("Ok!");

		
	}
}


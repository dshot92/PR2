import java.util.Arrays;

public class TestComparable{

	public static void main(String[] args){
		Comparable[] c = new Comparable[5];

		// Nome, Cognome, anno di nascita
		c[0] = new Persona("Mario", "Rossi", 1980);

		// Nome, lunghezza della coda in cm
		c[1] = new Gatto("Fuffi", 10.0);

		// Nome, Cognome, anno di nascita, università
		c[2] = new Studente("Bruno", "Bianchi", 1991, "Cagliari");

		// Nome
		c[3] = new Animale("Boris");



		// In questo esercizio due Persone sono uguali se hanno stesso anno di nascita
		Persona  p = (Persona)c[0];
		Studente s = (Studente)c[2];



		Studente s2 = new Studente("Gianni", "Verdi", 1980, "Sassari");
		assert p.equals(s2);
		assert s2.equals(p);

		Persona p2 = new Persona("Bruno", "Bianchi", 1991);
		assert !p.equals(p2);
		assert p2.equals(s);



		// In questo esercizio due Animali sono uguali se hanno stesso nome
		Animale a = (Animale)c[3];
		Gatto 	g = (Gatto)c[1];

		assert !a.equals(g);

		Gatto g2 = new Gatto("Boris", 12.5);
		assert g2.equals(a);



		// In questo esercizio una Persona è più grande di un'altra se è nata prima
		Persona[] persone = new Persona[3];
		persone[0] = new Persona("Bruno", "Bianchi", 1991);
		persone[1] = new Persona("Mario", "Rossi", 1980);
		persone[2] = new Persona("Carlo", "Verdi", 1985);

		// Array prima dell'ordinamento
		assert Arrays.toString(persone).equals("[Bruno, Mario, Carlo]");

		// Ordinamento
		Arrays.sort(persone);

		// Array dopo l'ordinamento (decrescente)
		assert Arrays.toString(persone).equals("[Bruno, Carlo, Mario]");



		// In questo esercizio un Animale è più grande di un altro se, in ordine alfabetico,
		// il suo nome è più grande dell'altro nome.
		Animale[] animali = new Animale[3];
		animali[0] = new Animale("Fuffi");
		animali[1] = new Animale("Bau");
		animali[2] = new Animale("Boris");

		// Array prima dell'ordinamento
		assert Arrays.toString(animali).equals("[Fuffi, Bau, Boris]");

		// Ordinamento
		Arrays.sort(animali);

		// Array dopo l'ordinamento (crescente)

		assert Arrays.toString(animali).equals("[Fuffi, Boris, Bau]");


		System.out.println("ok");
	}
}

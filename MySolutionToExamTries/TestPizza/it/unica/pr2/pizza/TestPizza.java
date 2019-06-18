package it.unica.pr2.pizza;

import java.util.Set;

public class TestPizza {

public static void main(String[] args) {

		// C-- [18]
		User marco = new Cliente("Marco", "Carta","mcarta@miaemail.it");
		Admin admin = new Admin("administrator@sito.it");

		//assert ( admin instanceof Cliente);
		assert ((User) admin).email().equals("administrator@sito.it");


		// C++ [22]
		assert "Marco Carta (mcarta@miaemail.it)".equals( ""+marco);

		assert marco.id() == 1;
		assert admin.id() == 2;

		// B [25]

		User utenteAnonimo = new AbstractUser() {
		@Override
		public String email() {
			return null;
			}
		};
		assert utenteAnonimo.id() == 3;
		assert utenteAnonimo.email() == null;


		// B+ [28]

		User[] u = new User[] {utenteAnonimo, admin, marco};
		Set users = User.set(u);
		assert users.size()==3;

		users.add(new Cliente("Marco","Carta","mcarta@miaemail.it"));
		System.out.println(users);
		System.out.println(users.size());
		assert users.size()==3;

		
		// A [30]
		try {
		users.add(new Cliente("Milena","Carta","mcarta@miaemail.it"));
		assert false;
		} catch(UserEmailMismatch e) {
		// email cliente gia' presente ma utente diverso; l'eccezione non viene lanciata per utenti di tipo diverso da Cliente
		assert true;
		}
		assert users.size()==3;

		// A+ [standing ovation + bragging rights]
/*
		((UserSet) users).showWindow(); // JavaFX2 con lista degli utenti con un bottone per chiudere la finestra ed uscire dal programma.
	*/
			System.out.println("Evertything OK");
}
}

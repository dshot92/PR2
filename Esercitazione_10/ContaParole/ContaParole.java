import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class ContaParole{
	public static void main(String[] args){
		Set<String> set = new HashSet<>();
		Scanner s = new Scanner(System.in);

		// Acquisizione input da tastiera e chiusura scanner
		String input = s.nextLine();
		s.close();

		// Divisione della stringa di input in parole
		String[] words = input.split(" ");

		// Inserimento delle parole nell'insieme
      	for(String w : words)
      		set.add(w);

      	// Stampa del numero totale di parole trovate (e stampa delle parole stesse)
		for (String str : set)
			System.out.println(str);

		System.out.println("size = " + set.size());
	}
}

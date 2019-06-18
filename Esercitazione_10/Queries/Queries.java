import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Queries{
	public static void main(String[] args){

        Scanner in = new Scanner(System.in);

		System.out.println("Inserisci il nome del file da cui leggere i dati di input. ");
		String inputFile = in.next();

		System.out.println("Inserisci la percentuale di dati che si vuole osservare. ");
		Integer percentuale = in.nextInt();

		System.out.println("Inserisci il nome del file in cui scrivere i dati di output. ");
		String outputFile = in.next();

		writeQueries( getTopN( getQueriesFromFile(inputFile), percentuale ), outputFile );

		in.close();
	}

	public static Collection<String> getTopN(String[] words, final int N){
	  	Map<String, Integer> map = new HashMap<>();

		// Costruisce una mappa: conta quante volte viene osservata ogni query.
		// Se la chiave è già contenuta nella mappa, il valore deve essere aggiornato.
		// Ci sono diversi alternative per implementarlo:
		for(int i=0; i<words.length; i++){

			// // a) Utilizzare il metodo contains
		  //   if(map.containsKey(words[i])){
		  // 		Integer counter = map.get(words[i]);
		  //   	map.put(words[i], counter+1);
		  // 	}
		  // 	else map.put(words[i], 1);

		    // b) Utilizzare il metodo merge (disponibile solo da Java8)
			map.merge(words[i], 1, Integer::sum);
		}

		// Recupera le associazioni chiave-valore della mappa
		Set<Entry<String, Integer>> entriesSet = map.entrySet();

		// Trasferisce i dati dalla struttura Set alla struttura List, in modo da poterli ordinare
		List<Entry<String, Integer>> entriesList = new ArrayList<>(entriesSet);

		// Ordina gli elementi con Collections.sort ma è necessario un Comparator.
		// Ci sono diversi alternative per implementarlo:

		// a) Utilizzare un comparatore implementato in una nuova classe (a fine file o in un nuovo file)
		//Collections.sort(entriesList, new MyComparator());

		/* b) Utilizzare una classe anonima
		Collections.sort(entriesList, new Comparator<Entry<String, Integer>>(){
			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2){
				return e2.getValue() - e1.getValue();
			}
		});*/

		// c) Utilizzare un'espressione lambda (disponibile solo da Java8)
		Collections.sort(entriesList, (e1,e2) -> e2.getValue() - e1.getValue());

		// Recupera i risultati dalla lista di Entry e gli rende nella struttura dati richiesta in output: Collection<String>
		// Recupera solo la percentuale di risultati richiesti.
		List<String> results = new ArrayList<>();
		double maxQ = N * words.length / 100.00;

		Iterator<Entry<String, Integer>> it = entriesList.iterator();
		while(it.hasNext() && maxQ>0){
			Entry<String,Integer> e = it.next();
			results.add(e.getKey());
			maxQ -= e.getValue();
		}
		return results;
	}

	public static String[] getQueriesFromFile(String nameFile){
		List<String> queries = new ArrayList<>();

		try(Scanner s = new Scanner(new File(nameFile))){

			while(s.hasNextLine()) queries.add(s.nextLine());

		} catch(FileNotFoundException e){
			e.printStackTrace();
        }

		return queries.toArray(new String[queries.size()]);
	}

	public static void writeQueries(Collection<String> collection, String outputFile){

		// Esempio di "try-with-resources" per gestire la chiusura del PrintWriter
		try(PrintWriter p = new PrintWriter(new File(outputFile))){

			for(String q : collection) p.println(q);

		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}


class MyComparator implements Comparator<Entry<String, Integer>>{
	@Override
  	public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2){
  		return e2.getValue() - e1.getValue();
  	}
}

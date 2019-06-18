package it.unica.pr2;


import java.util.stream.Collectors;
import java.util.*;

/*
  remember to use -ea
  warnings are considered errors

  Due in 75 min

 */
public class TestTuitter {

    public static class Data {
        public final int anno, mese, giorno;
        public Data(int anno, int mese, int giorno) {
            this.anno = anno;
            this.mese = mese;
            this.giorno = giorno;

        }

    }

    public static void main(String[] args) {
        // 19
        UtenteTuitter t = Tuitter.creaUtente("MARCO92", new TestTuitter.Data(1992,12,18)); // utente nato il 18 dicembre 1992
        assert t instanceof Tuitter;
        Utente u = t;
        assert u.username().equals("marco92"); // imposta sempre username tutto minuscolo


        // 24
        UtenteTuitter t2 = Tuitter.creaUtente("Martina", new TestTuitter.Data(1998,2,20)); // utente nato il 18 dicembre 1992
        assert t2 != t;
        UtenteTuitter tBis = Tuitter.creaUtente("MARco92", new TestTuitter.Data(1992,12,18)); // utente nato il 18 dicembre 1992
        assert tBis == t;

        // 27
        java.util.SortedSet<UtenteTuitter> users = Tuitter.utenti();
        assert users.size() == 2;
        assert users.first() == t2; // prima i giovani
        assert users.last() == t;

        UtenteTuitter t3 = Tuitter.creaUtente("chiara1998", new TestTuitter.Data(1998,2,21)); // utente nato il 18 dicembre 1992

        assert users.size() == 2;
        users = Tuitter.utenti();
        assert users.size() == 3;
        assert users.first() == t3; // prima i giovani
        assert users.last() == t;

        // 30
        List<UtenteTuitter> l = users.stream()
                .sorted(UtenteTuitter::ordineAlfabetico) // in base a username
                .collect(Collectors.toList());

        assert l.get(0) == t3; //chiara1998
        assert l.get(1) == t;  //marco92
        assert l.get(2) == t2; //martina
        
        System.out.println("Everything OK");
    }

}

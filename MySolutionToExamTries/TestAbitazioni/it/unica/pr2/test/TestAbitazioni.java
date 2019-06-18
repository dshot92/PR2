package it.unica.pr2.test;
 
import it.unica.pr2.abitazioni.*;
import java.util.*;
 
public class TestAbitazioni{
    public static void main(String[] args){
        // C
        Immobile casa = new Casa();
        List<Ambiente> c2 = casa;

        // C+
        casa.add(new Bagno(10));                // 10 mq
        casa.add(new Cucina(20));               // 20 mq
        casa.add(new CameraDaLetto(25));        // 25 mq
        casa.add(new CameraDaLetto(15));        // 15 mq
        casa.add(new Corridoio(12));            // 12 mq
 
        assert casa.superficie() == 10 + 20 + 25 + 15 + 12;
 
        assert casa.bilocale() == false;        // i bi locali hanno solo 1 cucina 1 bagno 1 camera da letto (no altri ambienti)
 
        // B
        Bagno bagno = new Bagno(13);
        assert bagno.toString().equals("Questo ambiente occupa 13mq");
        Cucina cucina = new Cucina(26);
        assert cucina.toString().equals("Questo ambiente occupa 26mq"); 

        Collections.sort(casa);                 // sort by dimension
        assert casa.get(0).getSuperficie() == 10;
	assert casa.get(1).getSuperficie() == 12;
        assert casa.get(2).getSuperficie() == 15;
        assert casa.get(3).getSuperficie() == 20;
        assert casa.get(4).getSuperficie() == 25;

        // A
        Collections.sort(casa, new StanzeByType()); // prima cucine, poi camere da letto, poi bagni, poi qualsiasi altro tipo; a parita' di tipo, dal piu' piccolo al piu' grande
       
        assert casa.get(0).getSuperficie() == 20;
        assert casa.get(1).getSuperficie() == 15;
        assert casa.get(2).getSuperficie() == 25;
        assert casa.get(3).getSuperficie() == 10;
        assert casa.get(4).getSuperficie() == 12;

        // A+
       // casa.mostraCasa();         // mostra una finestra JavaFX che mostra la lista delle stanze, nell'ordine corretto;
     
        System.out.println("Ok funziona");
    }
}

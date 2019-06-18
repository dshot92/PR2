/**
 *  Due in 40 minutes for mark <=22.
 *
 *  Only for those running for mark > 22 will have an extra 40 min (80 min total).
 *
 * */
package it.unica.pr2.processi; // stuff must be here

// it/unica/pr2/processi

import java.util.List;
import java.util.ArrayList;

public class TestProcesso {

    public static void main(String[] args) {
        /*
         *  Un Processo è una sequenza finita di Task
         *
         */

        // 18
        Processo p = Processo.getOrdini(); // processo speciale con 3 task (vedi di seguito)
	System.out.println(p.get(0));
	System.out.println(p);
        Task primoTaskDelProcessoP = p;
        List<Task> listaTaskDelProcessoP = p;

        assert p!=null;

        // 20
        assert p.size()==3;

        // 22

        assert "Task di avvio procedura".equals(primoTaskDelProcessoP.getDescrizione());
        Task t1 = p.get(0); // hint: 0 means first element of the List, 1 means second, 2 means third.
        Task t2 = p.get(1); // hint: 0 means first element of the List, 1 means second, 2 means third.

        assert t1 == primoTaskDelProcessoP;

	

/*	
        // 26
        Task t3 = t2.next();
        assert t3.equals(new EndingTask());
        assert t2.next().equals(p.get(2));

        assert t2.getDescrizione().equals("Task invio ordine");


        // 28
        assert t3.type().equals("EndingTask");
        assert t3.getDescrizione().equals(t3.type());
        String desc = "my new anonymous task";
        Task tNew = () -> desc;
        assert tNew.getDescrizione().equals(desc);
        assert tNew.type().equals("AnonymousTask");
        assert tNew.next() == null;


        // 30

        // Nota: per questo esercizio ignorare i next()
        ArrayList<Task> list = new ArrayList<>(p);
        list.sort(Task.sortByDescrizione);
        list.forEach((t) ->{System.out.println(t.getDescrizione());});
        assert list.get(0).getDescrizione().equals("EndingTask");
        assert list.get(1).getDescrizione().equals("Task di avvio procedura");
        assert list.get(2).getDescrizione().equals("Task invio ordine");

        /**/
	System.out.println("Everything OK");
    }
}

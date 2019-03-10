public class TestTorcia{
    
    public static void main(String[] args){
        
        // Dichiara due oggetti di tipo Torcia
        Torcia t1;
        Torcia t2;
        
        // Inizializza gli oggetti: richiama il costruttore che inizializza lo stato (torcia accesa)
        t1 = new Torcia();
        t2 = new Torcia();
        
        // Verifica dello stato iniziale degli oggetti
        System.out.println("t1: " + t1.getAccesa() + "; t2: " + t2.getAccesa() + ".");
        
        /** 
         * Possiamo manipolare lo stato di un oggetto tramite un suo metodo.
         * La modifica di t1 non ha conseguenze sullo stato di t2.
         */
        t1.spegni();
        System.out.println("t1: " + t1.getAccesa() + "; t2: " + t2.getAccesa() + ".");
        
        // Possiamo accendere nuovamente la torcia.
        t1.accendi();
        System.out.println("t1: " + t1.getAccesa() + "; t2: " + t2.getAccesa() + ".");
    }
    
}

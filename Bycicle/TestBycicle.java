public class TestBycicle {
 public static void main(String[] args) {
 // Crea due oggetti Bicicletta differenti
 Bycicle bike1 = new Bycicle();
 Bycicle bike2 = new Bycicle();
 // Chiamata dei metodi sugli oggetti
 bike1.accelarate(10);
 bike1.printSpeed();
 bike2.accelarate(10);
 bike2.accelarate(5);
 bike2.printSpeed();
 bike2.brake(20);
 bike2.printSpeed();
 }
}

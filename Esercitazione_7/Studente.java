public class Studente extends Persona {

  private String city;

  public Studente (String name, String surname, Integer year, String city){
    super(name, surname, year);
    this.city = city;
  }

  public String getCity(){
    return city;
  }

}

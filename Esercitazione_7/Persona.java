public class Persona implements Comparable < Persona > {

  private String name;
  private String surname;
  private Integer year;

  public Persona (String name, String surname, Integer year){
    this.name = name;
    this.surname = surname;
    this.year = year;
  }

  public String getName(){
    return name;
  }

  public String getSurame(){
    return surname;
  }

  public Integer getYear(){
    return year;
  }

  public boolean equals( Persona p){
    return this.year.equals(p.getYear());
  }

  @Override
  public String toString(){
    return this.name;
  }

  @Override
  public int compareTo( Persona a){
    return (this.getName().compareTo(a.getName()));
  }


}

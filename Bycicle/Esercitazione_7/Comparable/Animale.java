public class Animale implements Comparable < Animale >  {

  private String name;

  public Animale (String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public boolean equals( Animale p){
    return ( name.equals( p.getName() ));
  }

  @Override
  public String toString(){
    return this.name;
  }

  @Override
  public int compareTo( Animale a){
    return (-1)*(this.getName().compareTo(a.getName()));
  }

}

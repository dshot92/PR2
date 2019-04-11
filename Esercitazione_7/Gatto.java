public class Gatto extends Animale {

  private String name;
  private Double tailLength;

  public Gatto (String name, Double tailLength){
    super(name);
    this.tailLength = tailLength;
  }

  public Double getTailLength(){
    return tailLength;
  }



}

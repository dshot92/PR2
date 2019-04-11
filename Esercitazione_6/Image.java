abstract public class Image implements ScreenControl{

  private int brightness;

  public String status;
  public int volume;
  public int brightness;

  public void Image(){
    this.brightness = 0;
  }

  void show(){
    System.out.println("...Running...");
  }

  @Override
  void darker(){
    String temp = "";
    this.brightness--;
    for(int i = 0; i < this.brightness; i++){
      temp+= "*";
    }
    System.out.println(temp);
  }

  @Override
  void brighter(){
    String temp = "";
    this.brightness++;
    for(int i = 0; i < this.brightness; i++){
      temp+= "*";
    }
    System.out.println(temp);
  }
}

abstract public class Video implements ScreenControl, AudioControl{

  private int volume;
  private int brightness;

  public String status;
  public int volume;
  public int brightness;

  public void Video(){
    this.volume = 0;
    this.brightness = 0;
  }

  @Override
  void play(){
    System.out.println("...Running...");
  }

  @Override
  void lauder(){
    String temp = "";
    this.volume++;
    for(int i = 0; i < this.volume; i++){
      temp+= "!";
    }
    System.out.println(temp);
  }

  @Override
  void weaker(){
    String temp = "";
    this.volume--;
    for(int i = 0; i < this.volume; i++){
      temp+= "!";
    }
    System.out.println(temp);
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

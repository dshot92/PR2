abstract public class Audio implements AudioControl{}

  private int volume;
  private int minutes;
  private String format;

  // public String status;
  // public int volume;
  // public int brightness;

  public void Audio(){
    this.volume = 0;
    this.minutes = 3;
    this.format = "MIDI";
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
}

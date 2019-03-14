public class Rectang extends Shape{

  public Rectang (int x, int y, double width, double height){
    super(x, y, width, height);
  }

  public String getArea(){
     return (Double.toString(width * height));
  }

}

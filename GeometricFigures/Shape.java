public class Shape {

  public int x, y;  //coordinates of origin point

  public  double width, height; //lì dimensions of Shape

  public Shape(int x, int y){
    this.x = x;
    this.y = y;
  }
  public Shape(int x, int y, double width, double height){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }
  // public double getArea(){
  //   return ((this.width * this.height));
  // }

public String showOrigin(){
  return (Integer.toString(x)  + " , " +  Integer.toString(y));
}
  public static void main(String[] args){
    Shape shape = new Shape(0,5,10.0,20.0);
    Rectang rect = new Rectang(0,5,10.0,20.0);


    System.out.println("Origin Point = ( " + shape.showOrigin() + " )");
    System.out.println("Origin Point = ( " + rect.showOrigin() + " )");
    System.out.println("Rectangle Area = ( " + rect.getArea() + " )");

    // System.out.println("Area = " + (rect.getArea()));
  }
}

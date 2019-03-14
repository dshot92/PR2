public class RectangleTester{

  // Mode = 1 print perimeter, mode = 2 print area;
  public void printRectangle(boolean mode, Rectangle rectangle){
    if(mode){
      System.out.println("Perimeter " + rectangle.getPerimeter());
    }else{
      System.out.println("Areas " + rectangle.getArea());
    }
  }

  public static void main(String[] args){

    Rectangle rectangle = new Rectangle(10,20);
    RectangleTester tester = new RectangleTester();

    tester.printRectangle(true, rectangle);
    tester.printRectangle(false, rectangle);
  }
}

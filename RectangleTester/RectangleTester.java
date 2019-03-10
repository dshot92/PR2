public class RectangleTester{

  public int getPerimeter(java.awt.Rectangle rect){
    return (rect.height + rect.width)*2;
  }

  public int getArea(java.awt.Rectangle rect){
    return (rect.height * rect.width);
  }

  // Mode = 1 print perimeter, mode = 2 print area;
  public void printRectangle(boolean mode, java.awt.Rectangle rect){
    if(mode){
      System.out.println("Perimeter " + getPerimeter(rect));
    }else{
      System.out.println("Areas " + getArea(rect));
    }
  }

  public static void main(String[] args){



    java.awt.Rectangle rectangle = new java.awt.Rectangle(10,20);
    RectangleTester tester = new RectangleTester();

    tester.printRectangle(true ,rectangle);
    tester.printRectangle(false ,rectangle);
  }
}

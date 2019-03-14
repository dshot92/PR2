public class Rectangle{

	private int height;
		private int width;

public Rectangle(int x, int y){
	this.width = x;
	this.height = y;
}

public int getPerimeter(){
    return (this.height + this.width)*2;
  }

  public int getArea(){
    return (this.height * this.width);
  }
}

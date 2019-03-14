public class Point2D{

	private double x, y;

	public Point2D(){
		this.x = 0;
		this.y = 0;
	}

	public Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public double getDistanceTo(Point2D point){
		return Math.sqrt((Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2)));
	}

	public double getDistanceTo(double x1, double y1){
		return Math.sqrt((Math.pow((this.x - x1), 2) + Math.pow((this.y - y1), 2)));
	}
}

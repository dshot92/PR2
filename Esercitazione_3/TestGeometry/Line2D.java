public class Line2D{

	private Point2D[] point = new Point2D[2];

	public Line2D (Point2D point1, Point2D point2){
		this.point[0] = point1;
		this.point[1] = point2;
	}

	public double getLength(){
		return this.point[0].getDistanceTo(point[1]);

	}

	public boolean isContiguousWith(Line2D line){
		if( this.point[1].getX() == line.point[1].getX() && this.point[1].getY() == line.point[1].getY() ){
			return true;
		}

		if( this.point[0].getX() == line.point[1].getX() && this.point[0].getY() == line.point[1].getY() ){
			return true;
		}

		if( this.point[1].getX() == line.point[0].getX() && this.point[1].getY() == line.point[0].getY() ){
			return true;
		}

		if( this.point[0].getX() == line.point[0].getX() && this.point[0].getY() == line.point[0].getY() ){
			return true;
		}

		return false;
	}
}
}

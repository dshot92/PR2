public class TestGeometry{

	public static void main(String[] args){

		Point2D punto = new Point2D(2.0, 3.0);

		assert punto.getX() == 2.0;
		assert punto.getY() == 3.0;

		Point2D origine = new Point2D();

		assert punto.getDistanceTo(origine) == Math.sqrt(13);
		assert punto.getDistanceTo(1, 0.0) == Math.sqrt(10);

		Line2D linea = new Line2D(origine, punto);

		assert linea.getLength() == punto.getDistanceTo(origine);

		Point2D altroPunto = new Point2D(5, 7);
		Line2D altraLinea = new Line2D(punto, altroPunto);

		assert linea.isContiguousWith(altraLinea);

		System.out.println("Ok!");
	}
}

public class TestQuadraticEquation{

	public static void main(String[] args){

		QuadraticEquation eq = new QuadraticEquation(1.0, -5.0, 6.0); //ax^2 + bx + c = 0

		assert eq.getSolution1() == 3.0;
		assert eq.getSolution2() == 2.0;

		System.out.println("Ok!");

	}
}
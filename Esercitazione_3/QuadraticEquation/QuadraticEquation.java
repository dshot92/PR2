public class QuadraticEquation {
	double a, b, c;

	public QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private double delta(){
		return (this.b * this.b) - ( 4 * this.c * this.a );
	}
	
	public double getSolution1(){
		return ((-(this.b) + this.delta())/2);
	}

	public double getSolution2(){
	return ((-(this.b) - this.delta())/2);
	}

}

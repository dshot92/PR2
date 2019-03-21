package finanza;

public class Valuta {


	private Double val;

	private String name;

	public Valuta(String name, Double val){
		this.val = val;
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public Double getVal(){
		return this.val;
	}


}

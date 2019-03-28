package finanza;

public class Valuta {


	private Double val;

	private String name;
	private String abbr;
	private int number;

	public Valuta(String name, String abbr, Double val, int number){
		this.val = val;
		this.name = name;
		this.abbr = abbr;
		this.number = number;
	}

	public String getName(){
		return this.name;
	}

	public String getAbbr(){
		return this.abbr;
	}

	public int getNumber(){
		return this.number;
	}

	public Double getVal(){
		return this.val;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Valuta)) return false;
		Valuta other = (Valuta) obj;

		if (this.name == null) {
			if (other.getName() != null)
			return false;
		} else if (!this.getName().equals(other.getName())){
			return false;
		} else if (!this.getVal().equals(other.getVal())){
			return false;
		} else if (!this.getAbbr().equals(other.getAbbr())){
			return false;
		}	else if (this.number != other.getNumber()){
			return false;
		}

		return true;
	}

}

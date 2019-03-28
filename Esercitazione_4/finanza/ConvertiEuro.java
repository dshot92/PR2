package finanza;

import finanza.eccezioni.*;

public class ConvertiEuro {

	private int count;
	Valuta[] valute;

	public ConvertiEuro(int num){
		valute = new Valuta[num];
		count = 0;
	}

	public void impostaValuta(Valuta val){
		if(count != this.valute.length){
			this.valute[count] = val;
			count++;
		}else{
			throw new ConvertitoreOverflowException("Overflow - not more than 5 Valute");
		}
	}

	public int getCount(){
		return this.count;
	}

	@Override
	public String toString(){

		String aux = "[";

		for(int i = 0; i < this.count ; i++){
			aux += "(" + this.valute[i].getAbbr() + ", " +  this.valute[i].getVal();
			if(i != this.valute.length -1)
			aux += "), ";
			else
			aux += ")";
		}
		return aux + "]";
	}

	public Double converti(Double num, String name){
		Double ret = -1.0;
		for(int i = 0; i <  count; i++){
			if(this.valute[i].getName().equals(name)){
				return (num * this.valute[i].getVal());

			}
		}
		return ret;
	}

	public Double converti(Double num, Valuta val){
		Double ret = -1.0;
		int i;
		for( i = 0; i <  count; i++){
			if(this.valute[i].equals(val)){
				return (num * this.valute[i].getVal());

			}
		}
		if(i == count){
			throw new ValutaNonTrovataException("Error!!!");
		}

		return ret;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof ConvertiEuro)) return false;
		ConvertiEuro other = (ConvertiEuro) obj;

		for(int i = 0; i < this.valute.length  ; i++){
			if(!this.valute[i].equals(other.valute[i])){
				return false;
			} else if(this.valute[i].getNumber() != other.valute[i].getNumber()){
					return true;
				}
		}

		return true;
	}

}

package finanza;

public class ConvertiEuro {


	private int count;
	Valuta[] valute;

	public ConvertiEuro(){
		valute = new Valuta[3];
		count = 0;
	}

	public boolean impostaValuta(Valuta val){
		if(count != 3){
			this.valute[count] = val;
			count++;
			return true;
		}else
		return false;
	}

	@Override
	public String toString(){

		String aux = "[";

		for(int i = 0; i < this.count ; i++){
			aux += "(";
			aux += this.valute[i].getName();
			aux += ", ";
			aux += this.valute[i].getVal();
			if(i != 2)
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


}

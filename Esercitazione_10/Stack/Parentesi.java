import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Parentesi{
	private Stack<String> s = new Stack<String>();	
    private String inputFile;
    private String outputFile;
    
    
    public Parentesi(String inputFile, String outputFile){
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }
    
    
	public boolean leggiEspressione(){
    
		try(Scanner in = new Scanner(new File(inputFile))){

			while (in.hasNextLine()){
				String temp = in.next();
				s.push(temp);
			}

		}catch(FileNotFoundException e){
			e.printStackTrace();
            return false;
		}
        
        return true;
	}


	public void stampaEspressione(){
		System.out.println("\nLettura Stack: ");
		for(int i=s.size()-1; i>=0; i--){
			System.out.println(s.get(i));
		}
	}


	public void valutaEspressione(){
		boolean result = true;
		int totale = 0;
		int dim = s.size();
		PrintWriter out = null;

        int i=0;
        while(i<dim && result){
			String temp = s.pop();

			if(temp.equals("(")){
				totale ++;
			}else{
				totale --;
				if(totale > 0) result = false;
			}
            
            i++;
		}

		if(totale != 0) result = false;

		try{
			out = new PrintWriter(outputFile);
			out.println(result);
		}
		catch(Exception e){
			e.printStackTrace();
	
		} finally{
			if(out != null) out.close();
		}
	}


	public static void main(String[] args){
		Parentesi p = new Parentesi(args[0], args[1]);
		
        if(p.leggiEspressione()){
            p.stampaEspressione();
            p.valutaEspressione();
        }
	}
}

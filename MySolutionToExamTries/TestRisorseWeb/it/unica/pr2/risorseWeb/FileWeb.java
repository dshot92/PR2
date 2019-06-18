package it.unica.pr2.risorseWeb;

import java.util.*;
import java.lang.*;
import java.io.*;

public class FileWeb extends RisorsaWeb{

	public FileWeb(String nome, String contenuto){
		super(nome, contenuto);
	}

	    public FileWeb(String a){ 
        
        super(a, FileWeb.getContenutoDaFile(a));        
        
        
    }

    public void salva(){

        try{
            FileWriter nuovo;
            BufferedWriter dati;

            nuovo = new FileWriter(super.getNome());
            dati= new BufferedWriter(nuovo);

            dati.write(super.getContenuto());
            dati.close();


        }catch (IOException e){
            System.out.print("file not found!") ;
        }


    }
    

   static public String getContenutoDaFile(String a){
            String nuovo="";
       
       try{
            FileReader fileScritto = new FileReader(a);
            BufferedReader buff = new BufferedReader(fileScritto);
            
            while(nuovo != null) {
                nuovo=buff.readLine();
                System.out.println(nuovo);
            }
            }catch (IOException e){
                System.out.print("file not found!") ;
            }
        
        return nuovo;
    }

}

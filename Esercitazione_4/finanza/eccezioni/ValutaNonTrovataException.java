package finanza.eccezioni;

public class ValutaNonTrovataException  extends RuntimeException{

  public ValutaNonTrovataException(String error){
    System.out.println("Error ConvertitoreOverflowException " + error);

  }
}

package finanza.eccezioni;

public class ConvertitoreOverflowException extends RuntimeException{

  public ConvertitoreOverflowException(String error){
    System.out.println("Error ConvertitoreOverflowException " + error);
  }

}

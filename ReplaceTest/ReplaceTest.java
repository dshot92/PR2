import java.util.Arrays;

public class ReplaceTest {

  public String convert (String par){
    par = par.replace('i','!');
    par = par.replace('s','$');
    return par;
  }

  public static void main(String[] args){

    ReplaceTest converter = new ReplaceTest();

    // for(int n = 0 ; n < args.length; n++ ){
    System.out.println(java.util.Arrays.toString(args));
    // }

    for(int n = 0 ; n < args.length; n++ ){
      args[0] = converter.convert(args[n]);
    }

    // for(int n = 0 ; n < args.length; n++ ){
    System.out.println(java.util.Arrays.toString(args));
    // }
  }
}

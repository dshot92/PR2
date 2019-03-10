import java.util.Random;
import java.util.Arrays;

public class DiceSimulator{

  public static void main(String[] args){

    java.util.Random generator = new java.util.Random();
    // int n = generator.nextInt(6);

    int[] lanci = new int[3];

    for (int n = 0; n < 3; n++){
      lanci[n] = generator.nextInt(6) + 1;
    }

    System.out.println( java.util.Arrays.toString(lanci) );
  }
}

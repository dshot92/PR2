import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordCount {

  public static void main(String[] args){

    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> listScanner = new ArrayList<String>();

    try(
    BufferedReader in = new BufferedReader( new FileReader("input.txt"));
    PrintWriter out = new PrintWriter( new FileWriter("output.txt"));
    Scanner scan = new Scanner(System.in)
    ){
      String l;
      while( (l = in.readLine() ) != null ){
        list.add(l);
      }

      listScanner = scan.stream().map(s -> s.split("\\s+")).collect(Collectors.toList());

      // while( (scan.hasNext()) ){
      //   l = scan.next("\\s+");
      //   listScanner.add(l);
      // }
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }catch(IllegalArgumentException e){
      System.out.println(e);
    }catch(InputMismatchException e){
      System.out.println(e);
    }

    System.out.println("Word Count in Buffered Reader: " + list.size());
    System.out.println("Word Count in Scanner Input: " + listScanner.size());

  }


}

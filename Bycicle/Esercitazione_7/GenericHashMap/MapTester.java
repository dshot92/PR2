import java.awt.Color;
import java.util.Set;

/** This program tests a map that maps names to colors. */
public class MapTester{
  public static void main(String[] args){
    // Test 1
    GenericsHashMap<String, Color> favoriteColors = new GenericsHashMap<>();

    favoriteColors.put(new String("Juliet"), Color.pink);
    favoriteColors.put(new String("Romeo"), Color.green);
    favoriteColors.put(new String("Adam"), Color.blue);
    favoriteColors.put(new String("Eve"), Color.pink);
    favoriteColors.put(new String("Romeo"), Color.white);

    System.out.println("size: " + favoriteColors.size());

    Set<String> keySet = favoriteColors.getKeys();
    System.out.println("\n");
    for (String key : keySet){
      Color value = favoriteColors.get(key);
      System.out.println(key + "\t->\t" + value);
    }
    System.out.println("\n");


    // Test 2
    GenericsHashMap<Integer, String> phonebook = new GenericsHashMap<>();

    phonebook.put(123, "Juliet");
    phonebook.put(124, "Romeo");
    phonebook.put(345, "Adam");
    phonebook.put(666, "Eve");
    phonebook.put(123, "Romeo");

    System.out.println("size: " + phonebook.size());

    Set<Integer> newKeySet = phonebook.getKeys();
    System.out.println("\n");
    for (Integer key : newKeySet){
      String value = phonebook.get(key);
      System.out.println(key + "\t->\t" + value);
    }
    System.out.println("\n");
  }
}

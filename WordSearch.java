import java.util.*;

public class WordSearch {
  // Print next line method
  public static void println(String string) {
    System.out.println(string);
  }

  // Print method
  public static void print(String string) {
    System.out.print(string);
  }

  // Random number
  public static int random(int bound) {
    Random rand = new Random();
    return rand.nextInt(bound);
  }

  // Sleep the program
  static void sleep(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  // Factorial function
  static int factorial(int number) {
    int i, fact = 1;
    for (i = 1; i <= number; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static void wordTable(String word) {

    String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
        "T", "U", "V", "W", "X", "Y", "Z" };

    String[] lettersInWord = new String[word.length()];

    for (int i = 0; i < word.length(); i++) {
      lettersInWord[i] = String.valueOf(word.charAt(i));
    }

    for (int x = 0; x < 10; x++) {

      for (int y = 0; y < 10; y++) {
        print(letters[random(letters.length)] + " ");
      }

      println(" ");
    }
  }


  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    wordTable("Cat");
  }
}

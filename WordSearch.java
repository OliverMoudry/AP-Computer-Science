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
    String[] wordSearch = new String[50];
    String[] lettersInWord = new String[word.length()];

    for (int i = 0; i < wordSearch.length; i++) {
      wordSearch[i] = letters[random(letters.length)];
    }
    for (int l = 0; l < word.length(); l++) {
      lettersInWord[l] = String.valueOf(word.charAt(l));
    }
    for (int n = 0; n < lettersInWord.length; n++) {
      wordSearch[n+15] = lettersInWord[0];
    }
    
    int numberTracker = 0;
    for (int x = 0; x < 10; x++) {
      for (int y = 0; y < 5; y++)
        System.out.println(wordSearch[numberTracker]);
        println(" ");
        numberTracker++;
    }

    for (int p = 0; p < wordSearch.length; p++) {
      for (int o = 0; 0 <= 5; o++) {
        if (0 == 5) {
          System.out.println(" ");
        } else {
          System.out.println(wordSearch[p]);
        }
        
      }
    }
  }


  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    
  }
}

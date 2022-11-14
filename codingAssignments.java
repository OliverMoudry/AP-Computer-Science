import java.util.Scanner;
import java.util.*;
import java.util.Random;

public class codingAssignments {
  // Print next line method
  public static void println(String string) {
    System.out.println(string);
  }

  // Print method
  public static void print(String string) {
    System.out.print(string);
  }

   // Random number
  public static int random(int bound){
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
  
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    for (int y = 1; y <= 4; y++) {
        for (int x = 1; x <= 4; x++) {
            print(x*x + " ");
        }
    println(" ");
    }

    
  
  }


}
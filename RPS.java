import java.util.Scanner;
import java.util;
import java.util.Random;

public class RPS {
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
    rand = rand.nextInt(bound);
    return rand;
  }
  
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
  
  }


}


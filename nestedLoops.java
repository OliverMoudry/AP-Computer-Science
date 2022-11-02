import java.util.Scanner;

import javax.swing.JTable.PrintMode;

import java.util.*;
import java.util.Random;

public class nestedLoops {
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
  /*static void sleep(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InteruptedException e) {
      Thread.currentThread().interrupt();
    }
  } */
  
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);

    int x = 0;
    int y = 0;
    for (y = 5; y > 0; y--) {
        for (x = 5; x >= y; x--){
            print("*");
        }
        println("");
    }

  
  }


}


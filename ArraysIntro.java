import java.util.*;

public class ArraysIntro {
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

  // Factorial function
  static int factorial(int number) {
    int i,fact = 1;     
    for(i = 1; i <= number; i++){    
      fact = fact * i;    
    }
    return fact;
  }
  
  public static void main (String args[]) {
    int[] numList = {9, 6, 4, 2, 0};

    for (int i = 0; i < numList.length; i++) {
        numList[i] = 0;
    }

    println(Arrays.toString(numList));
  
  }

  ArrayList<Integer> sizes = new ArrayList<Integer>();

  sizes.add(1);

  sizes.set(0, 50);

  sizes.remove(0);

}
import java.util.*;

public class Static {
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

  public Static () {
    
  }

  public static void Henry(String haircolor) {
    if (haircolor.equalsIgnoreCase("ginger")) {
        println("ginger");
    } else {
        println("not ginger");
    }
  }
  
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    Henry("Ginger");

  }


}


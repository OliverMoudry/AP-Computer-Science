import java.util.*;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class File2 {
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
    Scanner keyboard = new Scanner(System.in);

    println("F(x) = (x!)*2, x = ");
    int x = keyboard.nextInt();
    Function function = new Function();

    println( "F(x) = " + function.MathFunction(x));

    println("Please enter a number");
    int X = keyboard.nextInt();
    println("Please enter an exponent");
    int Y = keyboard.nextInt();

    println(function.exponentSolver(X, Y) + " ");
  
  }


}


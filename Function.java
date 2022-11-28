import java.util.*;

public class Function {
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

  public int MathFunction(int X) {
    return (factorial(X))*2;
  }

  public int exponentSolver(int number, int exponent) {
    for(int i = 1; i < exponent; i++){    
      number *= exponent;    
    }
    return number;
  }
   
  
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
  
    print("F(x) = (x!)*2, x =");
    int x = keyboard.nextInt();
    Function function = new Function();

    print( "F(x) = " + function.MathFunction(x));

    println("Please enter a number");
    int X = keyboard.nextInt();
    println("Please enter an exponent");
    int Y = keyboard.nextInt();

    println(function.exponentSolver(X, Y) + " ");

  }


}


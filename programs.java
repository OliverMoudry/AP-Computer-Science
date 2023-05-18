import java.util.*;

public class programs {
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
  // Fahrenheit to Celsius
  static int f2c(int fahrenheit) {
    return ((fahrenheit - 32) * 5/9);
  }

  // Earth to moon weight
  static int e2mWheight(int earthWeight) {
    return earthWeight / 6;
  }

  // Backwards name
  static void backwardsName(String name) {
    for (int i = name.length() - 1; i >= 0; i--) {
        System.out.print(name.charAt(i));
    }
  }

  // Seconds to hours, minutes, seconds
  static void secondsConvert(int seconds) {
    int hrs = 0;
    int mins = 0;
    int secs = seconds;
    while (true) {
      if (secs > 3600) {
        secs -= 3600;
        hrs += 1;
      }
      if (secs > 60) {
        secs -= 60;
        mins += 1;
      }
      if (secs < 60) {
        break;
      }
    }
    System.out.println("There are " + hrs + " hours, " + mins + " minutes, and " + secs + " seconds in " + seconds); 
  }


  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    
  }


}


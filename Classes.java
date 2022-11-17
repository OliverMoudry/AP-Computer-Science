import java.util.*;

class MultiClass{
    private static int x;
    
    private static String input;

    public void MathFunctions(int X) {
        x = X;
    }    

    public void removeLastCharacter(String Input) {
        input = Input.substring(0, Input.length() - 1);
    }

    public boolean isLengthEven() {
        boolean boolean1 = false;
        if (input.length() % 2 == 0) {
            boolean1 = true;
        } else {
            boolean1 = false;
        }
        return boolean1;
            
    }



    public String toString(){

        return "F(" + x + ") = 3(" + x + ") + 5 = " + ((3 * x) + 5) + ", G(" + x + ") = 4(" + x + ") - 8 = " + ((4 * x) - 8) + ", Your new string is " + input + ", your word is even: " + isLengthEven();
    }
}

public class Classes {
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

    println("Please enter an X value: ");
    int x = keyboard.nextInt();

    //print("Please enter a word: ");
    //String word = keyboard.nextLine();
    String word = "hello";

    MultiClass functions = new MultiClass();

    functions.MathFunctions(x);
    functions.removeLastCharacter(word);
    functions.isLengthEven();

    println(functions.toString());
  
  }


}


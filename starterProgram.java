import java.util.Scanner;
import java.util.*;

public class starterProgram {
    
    // Print next line method
    public static void println(String string) {
        System.out.println(string);
    }
  
     // Print method
    public static void print(String string) {
        System.out.print(string);
    }

    // Random number
    public static int random() {
        Random rand = new Random();
        rand = Random.nextint();
        return rand;
     }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        print("Please enter a word: ");
        String input = keyboard.nextLine();
        print("The last character of the string is " + input.charAt(input.length()-1) + " and the second to last character is " + input.charAt(input.length()-2));



    }


}
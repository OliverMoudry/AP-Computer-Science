import java.util;
import java.util.Scanner;

public class loops {

    // Print next line method
    public static void println(String string) {
        System.out.println(string);
    }

    // Print method
    public static void print(String string) {
        System.out.print(string);
    }

    // Random number
    public static int random(int bound) {
        Random rand = new Random();
        rand = Random.nextint(bound);
        return rand;
    }

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        /*for (int age = 0; age <= 10; age++) { //For loop
            System.out.print("Your age is " + age + " ");
        }
        for (int age = 9; age >= 0; age--) { //For loop
            System.out.print("Your age is " + age + " ");
        }
        System.out.println("I need a number");
        int numb = keyboard.nextInt();
        int factorial = 1;
        int runningNumber = 1;
        while (runningNumber < numb) { // While loop
            runningNumber++;
            factorial *= runningNumber;
        }
        System.out.println("!" + numb + " equals " + factorial);
        */
        int x = 0; 
        do {
            x++;
            System.out.print(x + " ");
        }while(x<10);

        int X = 0;
        do {
            X--;
            System.out.print(X + " ");
            
        } while (X>0);
    }

}

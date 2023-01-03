import java.util.*;

public class twelveDays {
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
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        String[] gifts = {
                "A Partridge in a Pear Tree",
                "Two Turtle Doves",
                "Three French Hens",
                "Four Calling Birds",
                "Five Gold Rings",
                "Six Geese A-laying",
                "Seven Swans A-swimming",
                "Eight Maids A-milking",
                "Nine Ladies Dancing",
                "Ten Lords A-leaping",
                "Eleven Pipers Piping",
                "Twelve Drummers Drumming",
        };

        String[] days = {
                "first",
                "second",
                "third",
                "fourth",
                "fifth",
                "sixth",
                "seventh",
                "eighth",
                "ninth",
                "tenth",
                "eleventh",
                "twelfth"
        };

        for (int i = 0; i < days.length; i++) {
            println("On the " + days[i] + " day of Christmas, my true love gave to me, ");

            println(gifts[i]);

            for (int e = i - 1; e >= 0; e--) {
                println(gifts[e]);
            }

            println(" ");
            println(" ");
        }
    }
}
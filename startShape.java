import java.util.Scanner;
import java.util.*;
import java.util.Random;

public class startShape {
    // Print next line method
    public static void prln(String string) {
        System.out.println(string);
    }

    // Print method
    public static void pr(String string) {
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

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        pr("This program will create a shape....");
        prln("Choose a shape. Square, Rectangle, Right Triangle, or Isosceles.");
        String shape = keyboard.nextLine();
        while (!shape.equalsIgnoreCase("square") && !shape.equalsIgnoreCase("rectangle")
                && !shape.equalsIgnoreCase("right triangle") && !shape.equalsIgnoreCase("isosceles triangle")) {
            prln("Please enter one of those options: Square, Rectangle, Right Triangle, or Isosceles.");
            shape = keyboard.nextLine();
        }
        pr("Enter a width: ");
        int width = keyboard.nextInt();
        pr("Now I need a height: ");
        int height = keyboard.nextInt();
        if (shape.equalsIgnoreCase("square")) {
            for (int y = 0; y < width; y++) {
                for (int x = 0; x < width; x++) {
                    pr(" * ");
                }

                prln(" ");
            }

        } else if (shape.equalsIgnoreCase("rectangle")) {
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    pr(" * ");
                }

                prln(" ");
            }
        } else if (shape.equalsIgnoreCase("right triangle")) {
            for (int y = 0; y < height; y++) {
                for (int x = 0; x <= y; x++) {
                    pr(" * ");
                }

                prln(" ");
            }
        } else if (shape.equalsIgnoreCase("isosceles triangle")) {
            for (int y = 0; y < height / 2; y++) {
                for (int x = 0; x <= y; x++) {
                    pr(" * ");
                }

                prln(" ");
            }

            for (int y = height / 2 + 1; y > 0; y--) {
                for (int x = y; x > 0; x--) {
                    pr(" * ");
                }

                prln(" ");
            }
            
        }
    }

}

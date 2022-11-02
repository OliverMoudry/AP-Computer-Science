import java.util.Scanner;

import java.util.random.*;

import java.util.*;

public class day2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int randNumb = rand.nextInt(101);
        int roundsPassed = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Number");
        int input = myObj.nextInt();
        roundsPassed++;

        while (input != randNumb) {
            if (input > randNumb) {
                System.out.println("too high. try again");
                input = keyboard.nextInt();
            } else if (input < randNumb) {
                System.out.println("too low. try again");
                input = keyboard.nextInt();
            }

            roundsPassed++;

        }
        System.out.println("U got it in " + roundsPassed + " turns");

    }

}

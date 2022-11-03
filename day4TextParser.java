import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.security.auth.Subject;

import java.util.*;

public class day4TextParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word lol");
        String word = keyboard.nextLine();
        System.out.println(word + " has " + word.length() + " chars :(");
        System.out.println(word + "'s 1st character is " + word.charAt(0));
        System.out.println(word.toUpperCase() + ".");
        System.out.println(word.toLowerCase() + ".");
        boolean containsThe = word.contains("The");
        System.out.println(word + " contains \' The \' is " + containsThe);
        System.out.println(word + " contains the following letters: " + word.substring(0,word.length()));

        int length = word.length();
        int halfway = length/2;
        int third = length/3;
        int secondThird = length*2/3;
        int lastThird = length;

        System.out.println(word + " is " + length + " characters long");
        System.out.println("The middle letter is " + word.charAt(halfway));
        System.out.println("The first third of the word is " + word.substring(0, third));
        System.out.println("The middle third is " + word.substring(third, secondThird));
        System.out.println("The last third is " + word.substring(secondThird, lastThird));

    }




}

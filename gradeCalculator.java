import java.util.Scanner;
import java.util.*;

public class gradeCalculator {

// Print next line method
public static void println(String string) {
    System.out.println(string);
}
  
// Print method
public static void print(String string) {
    System.out.print(string);
}
  

    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        println("This program will calculate your APCS grade. It will also tell you your letter grade.");
        print("Please enter your average grade for Key Concepts: ");
        int keyConcepts = keyboard.nextInt();
        print("Please enter your average grade for Projects: ");
        int projects = keyboard.nextInt();
        print("Please enter your average grade for Quizzes: ");
        int quizzes = keyboard.nextInt();
        print("Please enter your average grade for Tests: ");
        int tests = keyboard.nextInt();

        int finalGrade = ((keyConcepts * 40) + (projects * 20) + (quizzes * 20) + (tests * 20))/100;
        

        //println("You have a " + finalGrade + " in APCS");
        if (finalGrade >= 90) {
            print("You are passing with an A and a " + finalGrade + "%");
        } else if (finalGrade >= 80) {
            print("You are passing with a B and a " + finalGrade + "%");
        } else if (finalGrade >= 70) {
            print("You are barely passing with a C. You better start doing your work! You have a " + finalGrade + "%");
        } else if (finalGrade >= 60) {
            print("You are failing with a D. You HAVE to start doing your work NOW! You have a " + finalGrade + "%");
        } else if (finalGrade >= 0) {
            print("You honestly could fail this class if you dont start working. You have an F. Your grade is a " + finalGrade + "%");
        }



    }

}
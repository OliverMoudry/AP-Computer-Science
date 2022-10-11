import java.util.Scanner;
import java.util;
import java.sql.Array;
import java.util.Random;

public class RPS {
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
  
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    println("I will beat you in a rock paper scissors game. Please choose a difficulty. 1: Easy, 2: Medium, 3: Hard, 4: Impossible.");
    int difficulty = keyboard.nextInt();
    while (difficulty != 1 || difficulty != 2 || difficulty != 3 || difficulty != 4){
        println("Please enter 1, 2, 3, or 4");
        difficulty = keyboard.nextInt();
    }
    if (difficulty == 1 || difficulty == 2 || difficulty == 3) {
        String[] RPS ={"Rock", "Paper", "Scissors"};
        int comChoice = random(RPS.length);
        println("I need Rock, Paper, or Scissors.");
        String playerChoice = keyboard.nextLine();
        if (playerChoice.equalsIgnoreCase("rock") && RPS[comChoice].equalsIgnoreCase("paper")) {
          println("You lost. Boohoo.")
        } else if (playerChoice.equalsIgnoreCase("rock") && RPS[comChoice].equalsIgnoreCase("scissors") ) {
          println("");
        }
        




    } else if (difficulty == 4) {
        println("Please choose Rock, Paper, or Scissors.");
        String playerChoice = keyboard.nextLine();
        while (!playerChoice.equalsIgnoreCase("rock") || !playerChoice.equalsIgnoreCase("paper") || !playerChoice.equalsIgnoreCase("scissors")) {
            println("I need either Rock, Paper, or Scissors.");
            playerChoice = keyboard.nextLine();
        }
        if (playerChoice.equalsIgnoreCase("rock")) {
            println("YOU LOSE! THE COMPUTER CHOSE PAPER AND YOU CHOSE ROCK.");
        } else if (playerChoice.equalsIgnoreCase("paper")) {
            println("YOU LOSE! THE COMPUTER CHOSE SCISSORS AND YOU CHOSE PAPER.");
        } else if (playerChoice.equalsIgnoreCase("scissors")) {
            println("YOU LOSE! THE COMPUTER CHOSE ROCK AND YOU CHOSE SCISSORS.");
        }

        
    }
    
  
  }


}


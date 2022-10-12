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
  public static int random(int bound) {
    Random rand = new Random();
    return rand.nextInt(bound);
  }

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    println(
        "I will beat you in a rock paper scissors game. Please choose a difficulty. 1: Easy, 2: Medium, 3: Hard, 4: Impossible.");
    int difficulty = keyboard.nextInt();
    while (difficulty != 1 && difficulty != 2 && difficulty != 3 && difficulty != 4) {
      println("Please enter 1, 2, 3, or 4");
      difficulty = keyboard.nextInt();
    }
    if (difficulty == 1 || difficulty == 2) { 
      String[] RPS = { "Rock", "Paper", "Scissors" }; 
      int comChoice = random(RPS.length); 
      println("I need Rock, Paper, or Scissors."); 
      String playerChoice = "";
      while (!playerChoice.equals("Rock") && !playerChoice.equals("Paper") && !playerChoice.equals("Scissors")) {
        println("I need either Rock, Paper, or Scissors.");
        playerChoice = keyboard.nextLine(); 
      }  
      println(playerChoice + ", "+ RPS[comChoice]);
      if (playerChoice.equals("Rock") && RPS[comChoice].equals("Paper")) {
        println("You lost. L + Bozo.");
      } else if (playerChoice.equals("Rock") && RPS[comChoice].equals("Scissors")) {
        println("You won. Pog.");
      } else if (playerChoice.equals("Rock") && RPS[comChoice].equals("Rock")) {
        println("You tied. Kinda mid at this game ngl.");
      } else if (playerChoice.equals("Paper") && RPS[comChoice].equals("Paper")) {
        println("You tied. Kinda mid at this game ngl.");
      } else if (playerChoice.equals("Paper") && RPS[comChoice].equals("Scissors")) {
        println("You lost. L + Bozo.");
      } else if (playerChoice.equals("Paper") && RPS[comChoice].equals("Rock")) {
        println("You won. Pog.");
      } else if (playerChoice.equals("Scissors") && RPS[comChoice].equals("Paper")) {
        println("You won. Pog.");
      } else if (playerChoice.equals("Scissors") && RPS[comChoice].equals("Scissors")) {
        println("You tied. Kinda mid at this game ngl.");
      } else if (playerChoice.equals("Scissors") && RPS[comChoice].equals("Rock")) {
        println("You lost. L + Bozo.");
      }

    } else if (difficulty == 3) {
      println("Please choose Rock, Paper, or Scissors.");
      String playerChoice = keyboard.nextLine();
      while (!playerChoice.equals("Rock") && !playerChoice.equals("Paper") && !playerChoice.equals("Scissors")) {
        println("I need either Rock, Paper, or Scissors.");
        playerChoice = keyboard.nextLine();
      }
      if (playerChoice.equals("Rock")) {
        String[] PS = { "Rock", "Scissors" };
        int computerRandom = random(PS.length);
        String[] computerChoices = { "Paper", PS[computerRandom] };
        String finalComChoice = computerChoices[random(computerChoices.length)];
        if (finalComChoice.equals("Paper")) {
          println("You lost. L + Bozo. You chose " + playerChoice + ", and the computer chose " + finalComChoice);
        } else if (finalComChoice.equals(PS[computerRandom])) {
          if (PS[computerRandom].equals("Scissors")) {
            println("You won. Pog. You chose " + playerChoice + ", and the computer chose " + finalComChoice);
          } else if (PS[computerRandom].equals("Rock")) {
            println("You tied. Kinda mid at this game ngl. You chose " + playerChoice + ", and the computer chose "
                + finalComChoice);
          }
        }
      } else if (playerChoice.equals("Paper")) {
        String[] PS = { "Rock", "Paper" };
        int computerRandom = random(PS.length);
        String[] computerChoices = { "Scissors", PS[computerRandom] };
        String finalComChoice = computerChoices[random(computerChoices.length)];
        if (finalComChoice.equals("Scissors")) {
          println("You lost. L + Bozo. You chose " + playerChoice + ", and the computer chose " + finalComChoice);
        } else if (finalComChoice.equals(PS[computerRandom])) {
          if (PS[computerRandom].equals("Paper")) {
            println("You tied. Kinda mid at this game ngl. You chose " + playerChoice + ", and the computer chose "
                + finalComChoice);
          } else if (PS[computerRandom].equals("Rock")) {
            println("You won. Pog. You chose " + playerChoice + ", and the computer chose " + finalComChoice);
          }
        }
      } else if (playerChoice.equals("Scissors")) {
        String[] PS = { "Scissors", "Paper" };
        int computerRandom = random(PS.length);
        String[] computerChoices = { "Rock", PS[computerRandom] };
        String finalComChoice = computerChoices[random(computerChoices.length)];
        if (finalComChoice.equals("Rock")) {
          println("You lost. L + Bozo. You chose " + playerChoice + ", and the computer chose " + finalComChoice);
        } else if (finalComChoice.equals(PS[computerRandom])) {
          if (PS[computerRandom].equals("Scissors")) {
            println("You tied. Kinda mid at this game ngl. You chose " + playerChoice + ", and the computer chose "
                + finalComChoice);
          } else if (PS[computerRandom].equals("Paper")) {
            println("You won. Pog. You chose " + playerChoice + ", and the computer chose " + finalComChoice);
          }
        }
      }
    } else if (difficulty == 4) {
      println("Please choose Rock, Paper, or Scissors.");
      String playerChoice1 = keyboard.nextLine();
      while (!playerChoice1.equals("Rock") && !playerChoice1.equals("Paper") && !playerChoice1.equals("Scissors")) {
        println("I need either Rock, Paper, or Scissors.");
        playerChoice1 = keyboard.nextLine();
      }
      if (playerChoice1.equals("Rock")) {
        println("You lost. L + Bozo. You chose " + playerChoice1 + ", and the computer chose Paper");
      } else if (playerChoice1.equals("Paper")) {
        println("You lost. L + Bozo. You chose " + playerChoice1 + ", and the computer chose Scissors");
      } else if (playerChoice1.equals("Scissors")) {
        println("You lost. L + Bozo. You chose " + playerChoice1 + ", and the computer chose Rock");
      }
    }
  }
}

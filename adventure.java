import java.util.Scanner;
import java.util;
import java.util.Random;

public class adventure {
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
    int randnumb = rand.nextInt(bound);
    return randnumb;
  }

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    /*
     * choose your own adventure that needs at least 4 choices per path. one input
     * needs to be an integer. need while loops to recieve valid input
     * 
     * indentation, semicolon,
     * 
     */

    print("Please enter a username to continue. ");
    String username = keyboard.nextLine();

    println("Now create a password to go along with it. ");
    String password = keyboard.nextLine();

    println("Hello " + username + ", and welcome back to the ");

    println("You are on a " + random(500)
        + " km walk in the middle of nowhere and you are close to dying of exaustion. You see a forest to your left and a desert with an oasis to your right. 1: Go to the left into the forest where you might find food. 2: Go to the right into the desert toward the oasis where you could get water. Please type 1 for Forest and 2 for Desert.");
    int choice = keyboard.nextInt();
    while (choice != 1 && choice != 2) {
      println("Try again bozo");
      choice = keyboard.nextInt();
    }

    if (choice == 1) {
      print(
          "You start walking toward the forest lugging your heavy backpack behind you. You keep walking and you walk another "
              + random(10)
              + " km into the forest until you finally find a river. The white water rushing over the rocks assures you that it is probably safe to drink. You bend down and cup your hands preparing to scoop some water when you hear a siren in the distance. You raise your head and try to find where the sound came from. Do you 1, stay and try to find food, 2, try to investigate the sound, or 3, try to find your way out of the forest?");
      choice = keyboard.nextInt();
      while (choice != 1 && choice != 2 && choice != 3) {
        println("Try again bozo");
        choice = keyboard.nextInt();
      }
      if (choice == 1) {
            print("ERROR: 404. DUE TO TECHNICAL ISSUES YOU HAVE BEEN SIGNED OUT. PLEASE ENTER A USERNAME: ");
        input = keyboard.nextLine();
        println("PLEASE ENTER A PASSWORD: ");
        input2 = keyboard.nextLine();
        while (!input.equals(username) || !input2.equals(password)) {
          println("YOUR USERNAME OR PASSWORD WAS INCORRECT. PLEASE TRY AGAIN");
          println("PLEASE ENTER A USERNAME: ");
          String input = keyboard.nextLine();
          println("PLEASE ENTER A PASSWORD: ");
          String input2 = keyboard.nextLine();
        }

      }
    }

  }

}

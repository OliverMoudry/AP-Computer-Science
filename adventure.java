import java.util.Scanner;
import java.util;
import java.lang.ProcessBuilder.Redirect.Type;
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
    println("WARNING. ONLY THE FOREST PATH WORKS. CHOOSE FOREST>FOOD AND THEN WHATEVER YOU WANT.");

    print("Please enter a username to continue. ");
    String username = keyboard.nextLine();

    println("Now create a password to go along with it. ");
    String password = keyboard.nextLine();

    println("Hello " + username
        + ", and welcome to 'The Journey, an MMORPG focused on surviving in a world where you have nothing.");

    println("You are on a " + random(500)
        + " km walk in the middle of nowhere and you are close to dying of exaustion. You see a forest to your left and a desert with an oasis to your right. 1: Go to the left into the forest where you might find food. 2: Go to the right into the desert toward the oasis where you could get water. Please type 1 for Forest and 2 for Desert.");
    int choice = keyboard.nextInt();
    while (choice != 1 && choice != 2) {
      println("I need either 1 or 2");
      choice = keyboard.nextInt();
    }

    if (choice == 1) {
      println(
          "You start walking toward the forest you don't get far before you hear a cry from deep inside it. You figure it's just a bird so you keep walking. You walk another "
              + random(10)
              + " km into the forest until you finally find a river. The white water rushing over the rocks assures you that it is probably safe to drink. You bend down and cup your hands preparing to scoop some water when you hear a siren in the distance. You raise your head and try to find where the sound came from. Do you 1, stay and try to find food, 2, try to investigate the sound, or 3, try to find your way out of the forest?");
      choice = keyboard.nextInt();
      while (choice != 1 && choice != 2 && choice != 3) {
        println("I need either 1, 2, or 3");
        choice = keyboard.nextInt();
      }
      if (choice == 1) {
        println("ERROR: 404. DUE TO TECHNICAL ISSUES YOU HAVE BEEN SIGNED OUT. PLEASE ENTER A USERNAME: ");
        String input1 = keyboard.nextLine();

        println("PLEASE ENTER A PASSWORD: ");
        String input2 = keyboard.nextLine();

        while (!input1.equals(username) || !input2.equals(password)) {
          println("YOUR USERNAME OR PASSWORD WAS INCORRECT. PLEASE TRY AGAIN");
          print("PLEASE ENTER A USERNAME: ");
          input1 = keyboard.nextLine();

          print("PLEASE ENTER A PASSWORD: ");
          input2 = keyboard.nextLine();
        }

        println("Welcome back, " + username + "!");
        println(
            "Let's continue the story..... You look around trying to see if you can find anything edible when the stench of fresh Meaτ hits your nose. You notice that the Meaτ smell is coming from a clearing about "
                + random(10)
                + " meters away. Do you 1. Start walking toward the clearing with the Meaτ smell, or 2. Keep looking around for food.");
        choice = keyboard.nextInt();
        while (choice != 1 && choice != 2) {
          println("I need either 1 or 2");
          choice = keyboard.nextInt();
        }
        if (choice == 1) {
          println(
              "You walk slowly toward the clearing and upon entering it, you realize that the smell is coming from a ʜ∪Ꮇᴀɴ ʟᎬ𝐺 lying on the ground. You jump back with disgust but then something washes over you and you begin to walk toward it. You try as hard as you can but your body will not obey anything your mind is telling it. Your horrified as you realize that what you are looking at is a human leg cut off just below the knee. You get closer and closer. 5 meters. 4 meters. 3 meters. 2 meters. 1 meter. Suddenly you're there and your body is bending down to pick it up. You try as hard as you can to stop but you can't move a single muscle. Your hand grabs it and moves it closer to your face. You suddenly realize what is about to happen but before you can do anything you feel your teeth sink into the leg and rip out a chunk. Do you 1. Try to scream for help, or 2. Do nothing as the actions are repeated. Teeth sink in. Rip off a chunk of flesh. Chew. Swallow.");
          choice = keyboard.nextInt();
          while (choice != 1 && choice != 2) {
            println("I need either 1 or 2");
            choice = keyboard.nextInt();
          }
          if (choice == 1) {
            println(
                "You try to open your mouth and scream but another chunk of flesh is shoved in just as you open it. You look around as far as you can but ---------------------------------------------------------------");
            println(
                "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
            println(
                "---------------------------------------------------------------------------------------------------------------------------");
            println(
                "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
          } else {
            println(
                "You stand and do nothing as your mouth moves on its own. Your horrified but then-------------------");
            println(
                "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
            println(
                "---------------------------------------------------------------------------------------------------------------------------");
            println(
                "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
          }
        } else {
          println(
              "You change your mind at the last second and turn your back on the clearing. You don't know how but you've just saved yourself from a horrible fate. You see a deer scamper into the forest and realize that it could be your next meal. Do you 1. Try to chase after it and risk not catching it and starving to death, or 2. Turn back to the clearing where you can guarantee food and safety. ");
          choice = keyboard.nextInt();
          while (choice != 1 && choice != 2) {
            println("I need either 1 or 2");
            choice = keyboard.nextInt();
          }

          if (choice == 1) {
            println(
                "You chase the deer into the forest but then suddenly you are back in the same clearing. You keep running but when you stop, you're back in the same place. You realize now that if you don't go to the clearing, you will die of starvation soon. ");
            println(
                "You walk slowly toward the clearing and upon entering it, you realize that the smell is coming from a ʜ∪Ꮇᴀɴ ʟᎬ𝐺 lying on the ground. You jump back with disgust but then something washes over you and you begin to walk toward it. You try as hard as you can but your body will not obey anything your mind is telling it. Your horrified as you realize that what you are looking at is a human leg cut off just below the knee. You get closer and closer. 5 meters. 4 meters. 3 meters. 2 meters. 1 meter. Suddenly you're there and your body is bending down to pick it up. You try as hard as you can to stop but you can't move a single muscle. Your hand grabs it and moves it closer to your face. You suddenly realize what is about to happen but before you can do anything you feel your teeth sink into the leg and rip out a chunk. Do you 1. Try to scream for help, or 2. Do nothing as the actions are repeated. Teeth sink in. Rip off a chunk of flesh. Chew. Swallow.");
            choice = keyboard.nextInt();
            while (choice != 1 && choice != 2) {
              println("I need either 1 or 2");
              choice = keyboard.nextInt();
            }
            if (choice == 1) {
              println(
                  "You try to open your mouth and scream but another chunk of flesh is shoved in just as you open it. You look around as far as you can but ---------------------------------------------------------------");
              println(
                  "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
              println(
                  "---------------------------------------------------------------------------------------------------------------------------");
              println(
                  "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
            } else {
              println(
                  "You stand and do nothing as your mouth moves on its own. Your horrified but then-------------------");
              println(
                  "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
              println(
                  "---------------------------------------------------------------------------------------------------------------------------");
              println(
                  "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
            }
          } else {
            println(
                "You walk slowly toward the clearing and upon entering it, you realize that the smell is coming from a ʜ∪Ꮇᴀɴ ʟᎬ𝐺 lying on the ground. You jump back with disgust but then something washes over you and you begin to walk toward it. You try as hard as you can but your body will not obey anything your mind is telling it. Your horrified as you realize that what you are looking at is a human leg cut off just below the knee. You get closer and closer. 5 meters. 4 meters. 3 meters. 2 meters. 1 meter. Suddenly you're there and your body is bending down to pick it up. You try as hard as you can to stop but you can't move a single muscle. Your hand grabs it and moves it closer to your face. You suddenly realize what is about to happen but before you can do anything you feel your teeth sink into the leg and rip out a chunk. Do you 1. Try to scream for help, or 2. Do nothing as the actions are repeated. Teeth sink in. Rip off a chunk of flesh. Chew. Swallow.");
            choice = keyboard.nextInt();
            while (choice != 1 && choice != 2) {
              println("I need either 1 or 2");
              choice = keyboard.nextInt();
            }
            if (choice == 1) {
              println(
                  "You try to open your mouth and scream but another chunk of flesh is shoved in just as you open it. You look around as far as you can but ---------------------------------------------------------------");
              println(
                  "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
              println(
                  "---------------------------------------------------------------------------------------------------------------------------");
              println(
                  "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
            } else {
              println(
                  "You stand and do nothing as your mouth moves on its own. Your horrified but then-------------------");
              println(
                  "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
              println(
                  "---------------------------------------------------------------------------------------------------------------------------");
              println(
                  "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
            }
          }
        }

      } else if (choice == 2) {
        println("ERROR: 404. DUE TO TECHNICAL ISSUES YOU HAVE BEEN SIGNED OUT. PLEASE ENTER A USERNAME: ");
        String input1 = keyboard.nextLine();

        println("PLEASE ENTER A PASSWORD: ");
        String input2 = keyboard.nextLine();

        while (!input1.equals(username) || !input2.equals(password)) {
          println("YOUR USERNAME OR PASSWORD WAS INCORRECT. PLEASE TRY AGAIN");
          print("PLEASE ENTER A USERNAME: ");
          input1 = keyboard.nextLine();

          print("PLEASE ENTER A PASSWORD: ");
          input2 = keyboard.nextLine();
        }

        println("Welcome back, " + username + "!");
        println(
            "Let's continue the story..... You move toward the area that the sound is coming from and you discover a wide open field with no trees. You notice the outline of a ranger tower on the opposite side of the field and you see a road to your right with a rusty car swerved into a ditch. Do you 1. Go to the car on the road, or 2. Go across the field to the ");
        choice = keyboard.nextInt();
        while (choice != 1 && choice != 2) {
          println("I need either 1 or 2");
          choice = keyboard.nextInt();
        }
        if (choice == 1) {
          println(
              "You walk slowly toward the clearing and upon entering it, you realize that the smell is coming from a ʜ∪Ꮇᴀɴ ʟᎬ𝐺 lying on the ground. You jump back with disgust but then something washes over you and you begin to walk toward it. You try as hard as you can but your body will not obey anything your mind is telling it. Your horrified as you realize that what you are looking at is a human leg cut off just below the knee. You get closer and closer. 5 meters. 4 meters. 3 meters. 2 meters. 1 meter. Suddenly you're there and your body is bending down to pick it up. You try as hard as you can to stop but you can't move a single muscle. Your hand grabs it and moves it closer to your face. You suddenly realize what is about to happen but before you can do anything you feel your teeth sink into the leg and rip out a chunk. Do you 1. Try to scream for help, or 2. Do nothing as the actions are repeated. Teeth sink in. Rip off a chunk of flesh. Chew. Swallow.");
          choice = keyboard.nextInt();
          while (choice != 1 && choice != 2) {
            println("I need either 1 or 2");
            choice = keyboard.nextInt();
          }
          if (choice == 1) {
            println(
                "You try to open your mouth and scream but another chunk of flesh is shoved in just as you open it. You look around as far as you can but ---------------------------------------------------------------");
            println(
                "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
            println(
                "---------------------------------------------------------------------------------------------------------------------------");
            println(
                "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
          } else {
            println(
                "You stand and do nothing as your mouth moves on its own. Your horrified but then-------------------");
            println(
                "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
            println(
                "---------------------------------------------------------------------------------------------------------------------------");
            println(
                "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
          }
        } else {
          println(
              "You change your mind at the last second and turn your back on the clearing. You don't know how but you've just saved yourself from a horrible fate. You see a deer scamper into the forest and realize that it could be your next meal. Do you 1. Try to chase after it and risk not catching it and starving to death, or 2. Turn back to the clearing where you can guarantee food and safety. ");
          choice = keyboard.nextInt();
          while (choice != 1 && choice != 2) {
            println("I need either 1 or 2");
            choice = keyboard.nextInt();
          }

          if (choice == 1) {
            println(
                "You chase the deer into the forest but then suddenly you are back in the same clearing. You keep running but when you stop, you're back in the same place. You realize now that if you don't go to the clearing, you will die of starvation soon. ");
            println(
                "You walk slowly toward the clearing and upon entering it, you realize that the smell is coming from a ʜ∪Ꮇᴀɴ ʟᎬ𝐺 lying on the ground. You jump back with disgust but then something washes over you and you begin to walk toward it. You try as hard as you can but your body will not obey anything your mind is telling it. Your horrified as you realize that what you are looking at is a human leg cut off just below the knee. You get closer and closer. 5 meters. 4 meters. 3 meters. 2 meters. 1 meter. Suddenly you're there and your body is bending down to pick it up. You try as hard as you can to stop but you can't move a single muscle. Your hand grabs it and moves it closer to your face. You suddenly realize what is about to happen but before you can do anything you feel your teeth sink into the leg and rip out a chunk. Do you 1. Try to scream for help, or 2. Do nothing as the actions are repeated. Teeth sink in. Rip off a chunk of flesh. Chew. Swallow.");
            choice = keyboard.nextInt();
            while (choice != 1 && choice != 2) {
              println("I need either 1 or 2");
              choice = keyboard.nextInt();
            }
            if (choice == 1) {
              println(
                  "You try to open your mouth and scream but another chunk of flesh is shoved in just as you open it. You look around as far as you can but ---------------------------------------------------------------");
              println(
                  "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
              println(
                  "---------------------------------------------------------------------------------------------------------------------------");
              println(
                  "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
            } else {
              println(
                  "You stand and do nothing as your mouth moves on its own. Your horrified but then-------------------");
              println(
                  "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
              println(
                  "---------------------------------------------------------------------------------------------------------------------------");
              println(
                  "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
            }
          } else {
            println(
                "You walk slowly toward the clearing and upon entering it, you realize that the smell is coming from a ʜ∪Ꮇᴀɴ ʟᎬ𝐺 lying on the ground. You jump back with disgust but then something washes over you and you begin to walk toward it. You try as hard as you can but your body will not obey anything your mind is telling it. Your horrified as you realize that what you are looking at is a human leg cut off just below the knee. You get closer and closer. 5 meters. 4 meters. 3 meters. 2 meters. 1 meter. Suddenly you're there and your body is bending down to pick it up. You try as hard as you can to stop but you can't move a single muscle. Your hand grabs it and moves it closer to your face. You suddenly realize what is about to happen but before you can do anything you feel your teeth sink into the leg and rip out a chunk. Do you 1. Try to scream for help, or 2. Do nothing as the actions are repeated. Teeth sink in. Rip off a chunk of flesh. Chew. Swallow.");
            choice = keyboard.nextInt();
            while (choice != 1 && choice != 2) {
              println("I need either 1 or 2");
              choice = keyboard.nextInt();
            }
            if (choice == 1) {
              println(
                  "You try to open your mouth and scream but another chunk of flesh is shoved in just as you open it. You look around as far as you can but ---------------------------------------------------------------");
              println(
                  "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
              println(
                  "---------------------------------------------------------------------------------------------------------------------------");
              println(
                  "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
            } else {
              println(
                  "You stand and do nothing as your mouth moves on its own. Your horrified but then-------------------");
              println(
                  "YOU HAVE BEEN DISCONNECTED FROM THE GAME DUE TO INTERNET INSTABILITY. PLEASE CHECK YOUR MOTEM OR ROUTER AND TRY AGAIN.");
              println(
                  "---------------------------------------------------------------------------------------------------------------------------");
              println(
                  "You pull away from the computer tired. You check your phone and realize that it's already 3 am. You curse to yourself realizing that your mom would kill you if she knew you stayed up this early. You get up from your chair but fall over when you try to stand. You are confused at first with the pain but try to get up quickly thinking your mom might've heard the thump. You can't feel your left leg so thinking it's asleep you try to stand on your right leg. You fall over again but manage to catch yourself with your chair this time. You pull yourself up really confused this time. You reach to grab your left foot to shake it awake but you feel nothing. Your hands fill with air and you look down. Your knee is there. But your leg isn't.");
            }
          }
        }

      }

    }

  }
}

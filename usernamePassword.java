import java.util.Scanner;

public class usernamePassword {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = keyboard.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("Please enter a password: ");
        String password = keyboard.nextLine();

        while (!password.equals("123456789")) {
            System.out.println("Wrong password. Try again: ");
            password = keyboard.nextLine();
        }
        System.out.println("You got it");

    }

}
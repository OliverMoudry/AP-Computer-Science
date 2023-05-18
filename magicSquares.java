import java.util.*;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

public class magicSquares {
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
    int i,fact = 1;     
    for(i = 1; i <= number; i++){    
      fact = fact * i;    
    }
    return fact;
  }

  static void magicSquareDetector(int[][] magicsquare) {
    int[][] square = magicsquare;
    int magicNumber = 0;
    
    magicNumber = square[0][0] + square[0][1] + square[0][2];
    
    if (square[1][0] + square[1][1] + square[1][2] + square[1][3]!= magicNumber) {
        System.out.println("NOT A MAGIC SQUARE");
    } else if (square[2][0] + square[2][1] + square[2][2] + square[2][3] != magicNumber) {
        System.out.println("NOT A MAGIC SQUARE");
    } else if (square[0][0] + square[1][0] + square[2][0] + square[3][0] != magicNumber) {
        System.out.println("NOT A MAGIC SQUARE");
    } else if (square[0][1] + square[1][1] + square[2][1] + square[3][1] != magicNumber) {
        System.out.println("NOT A MAGIC SQUARE");
    } else if (square[0][2] + square[1][2] + square[2][2] + square[3][2] != magicNumber) {
        System.out.println("NOT A MAGIC SQUARE");
    } else if (square[0][3] + square[1][3] + square[2][3] + square[3][3] != magicNumber) {
        System.out.println("NOT A MAGIC SQUARE");
    } else {
        System.out.println("MAGIC SQUARE");
    }
  }
  
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);

    int[][] magicSquare = {{4, 14, 15, 0}, {9, 7, 6, 0}, {5, 11, 10, 0}, {0, 0, 0, 0}};

    

    System.out.println("7 0 5 X");
    System.out.println("2 4 6 X");
    System.out.println("3 8 1 X");
    System.out.println("Y Y Y X");
    System.out.println("Enter the first X on the right column: ");
    int x = keyboard.nextInt();
    magicSquare[0][3] = x;

    System.out.println("7 0 5 " + x);
    System.out.println("2 4 6 X");
    System.out.println("3 8 1 X");
    System.out.println("Y Y Y X");
    System.out.println("Enter the second X on the right column: ");
    int x1 = keyboard.nextInt();
    magicSquare[1][3] = x1;

    System.out.println("7 0 5 " + x);
    System.out.println("2 4 6 " + x1);
    System.out.println("3 8 1 X");
    System.out.println("Y Y Y X");
    System.out.println("Enter the third X on the right column: ");
    int x2 = keyboard.nextInt();
    magicSquare[2][3] = x2;

    System.out.println("7 0 5 " + x);
    System.out.println("2 4 6 " + x1);
    System.out.println("3 8 1 " + x2);
    System.out.println("Y Y Y X");
    System.out.println("Enter the fourth X on the right column: ");
    int x3 = keyboard.nextInt();
    magicSquare[3][3] = x3;

    System.out.println("7 0 5 " + x);
    System.out.println("2 4 6 " + x1);
    System.out.println("3 8 1 " + x2);
    System.out.println("Y Y Y " + x3);
    System.out.println("Enter the first Y on the bottom row: ");
    int y = keyboard.nextInt();
    magicSquare[3][0] = y;

    System.out.println("7 0 5 " + x);
    System.out.println("2 4 6 " + x1);
    System.out.println("3 8 1 " + x2);
    System.out.println(y + " Y Y " + x3);
    System.out.println("Enter the second Y on the bottom row: ");
    int y1 = keyboard.nextInt();
    magicSquare[3][1] = y1;

    System.out.println("7 0 5 " + x);
    System.out.println("2 4 6 " + x1);
    System.out.println("3 8 1 " + x2);
    System.out.println(y + " " + y1 + " Y " + x3);
    System.out.println("Enter the third Y on the bottom row: ");
    int y2 = keyboard.nextInt();
    magicSquare[3][2] = y2;

    System.out.println("7 0 5 " + x);
    System.out.println("2 4 6 " + x1);
    System.out.println("3 8 1 " + x2);
    System.out.println(y + " " + y1 + " " + y2 + " " + x3);

    magicSquareDetector(magicSquare);
  
  }


}


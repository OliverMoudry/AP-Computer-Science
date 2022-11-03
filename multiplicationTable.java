import java.awt.*;
import java.awt.MouseInfo;

import java.util.*;

import javax.swing.*;

public class multiplicationTable extends JPanel {
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

  static double mouseX;
  static double mouseY;

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int SCREEN_WIDTH = getSize().width;
    int SCREEN_HEIGHT = getSize().height;



  }


  public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      multiplicationTable panel = new multiplicationTable();

      JFrame frame = new JFrame("Multiplication");
      frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(panel, BorderLayout.CENTER);
      frame.setVisible(true);

      while (true) {
        panel.repaint();
        mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        mouseY = MouseInfo.getPointerInfo().getLocation().getY();
      }
   }


}


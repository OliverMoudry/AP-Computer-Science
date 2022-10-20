
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import java.awt.Image;
import java.awt.Toolkit;

import com.sun.tools.javac.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class houseProject extends JPanel {
  private static final long serialVersionUID = 7148504528835036003L;

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

  final int SCREEN_WIDTH = 1920;
  final int SCREEN_HEIGHT = 1057;

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    System.out.println(getSize());
    
    g.setColor(Color.BLACK);
    g.fillRect(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2, SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);


  }

  public static void main(String[] args) {

    var panel = new houseProject();

    var frame = new JFrame("House Project");
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.setVisible(true);
    

  }
}

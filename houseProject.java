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

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int SCREEN_WIDTH = getSize().width;
    int SCREEN_HEIGHT = getSize().height;
    g.setColor(Color.BLUE.brighter().brighter().brighter().brighter());
    g.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);

    g.setColor(Color.GREEN.darker());
    g.fillRect(0, (SCREEN_HEIGHT / 3) * 2, SCREEN_WIDTH, (SCREEN_HEIGHT / 3) * 2); // grass
    g.setColor(Color.ORANGE.darker().darker().darker());
    g.fillRect((SCREEN_WIDTH / 3), (SCREEN_HEIGHT / 3), 500, 400); // house

    for (int i = (SCREEN_WIDTH / 3) + 100; i < (SCREEN_WIDTH / 3) + 500; i += 200) { // windows
      g.setColor(Color.WHITE);
      g.fillRect(i, SCREEN_HEIGHT / 3 + 50, 100, 100);
    }
    g.setColor(Color.BLACK);
    g.drawLine(SCREEN_WIDTH / 3 + 150, SCREEN_HEIGHT / 3 + 400, SCREEN_WIDTH / 3 + 150, SCREEN_HEIGHT / 3 + 250); // door
    g.drawLine(SCREEN_WIDTH / 3 + 250, SCREEN_HEIGHT / 3 + 400, SCREEN_WIDTH / 3 + 250, SCREEN_HEIGHT / 3 + 250);
    g.fillArc(SCREEN_WIDTH / 3 + 150, SCREEN_HEIGHT / 3 + 200, 100, 100, 0, 180);
    g.setColor(Color.ORANGE.darker().darker().darker());
    drawTriangle(g, SCREEN_WIDTH / 3, SCREEN_HEIGHT / 3, SCREEN_WIDTH / 3 + 500, SCREEN_HEIGHT / 3, SCREEN_WIDTH / 2,
        SCREEN_HEIGHT / 4); // roof
        g.setColor(Color.GREEN);
    g.fillRect(SCREEN_WIDTH/4, SCREEN_HEIGHT/4 *3, 300, 100); // bush
    g.fillRect(SCREEN_WIDTH/4 * 2, SCREEN_HEIGHT/4 * 3, 300, 100); // bush
    g.setColor(Color.ORANGE.darker().darker().darker());
    g.fillRect(SCREEN_WIDTH/4, SCREEN_HEIGHT, SCREEN_WIDTH, SCREEN_HEIGHT); // tree trunk NOT FINISHED!
    g.fillOval(SCREEN_HEIGHT, SCREEN_HEIGHT, SCREEN_WIDTH, SCREEN_HEIGHT);// tree leaves NOT FINISHED!
  }

  public void drawTriangle(Graphics g, int x1, int y1, int x3, int y3, int x2, int y2) {
    int[] xpoints = { x1, x2, x3 };
    int[] ypoints = { y1, y2, y3 };
    g.fillPolygon(xpoints, ypoints, 3);
  }

  public static void main(String[] args) {

    houseProject panel = new houseProject();

    JFrame frame = new JFrame("House Project");
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.setVisible(true);

  }
}

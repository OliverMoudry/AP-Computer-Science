import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import java.awt.MouseInfo;
import java.util.concurrent.TimeUnit;

import com.sun.tools.javac.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class houseProject extends JPanel {
  private static final long serialVersionUID = 7148504528835036003L;
  static double mouseX;
  static double mouseY;

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

  public void setColor(Graphics graphics, int r, int g, int b) {
    Color customColor = new Color(r, g, b);
    graphics.setColor(customColor);
  }

  static double headBob;
  static int dt;

  

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int SCREEN_WIDTH = getSize().width;
    int SCREEN_HEIGHT = getSize().height;
    
    // setColor(g, random(255), random(255), random(255));
    g.setColor(Color.BLUE.darker());
    g.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);

    g.setColor(Color.GREEN.darker());
    g.fillRect(0, (SCREEN_HEIGHT / 3) * 2, SCREEN_WIDTH, (SCREEN_HEIGHT / 3) * 2); // grass
    g.setColor(Color.ORANGE.darker().darker().darker());
    g.fillRect((SCREEN_WIDTH / 3), (SCREEN_HEIGHT / 3), 500, 400); // house
    

    for (int i = (SCREEN_WIDTH / 3) + 100; i < (SCREEN_WIDTH / 3) + 500; i += 200) { // windows
      setColor(g, random(255), random(255), random(255));
      g.fillRect(i, SCREEN_HEIGHT / 3 + 50, 100, 100);
    }
    g.setColor(Color.BLACK);
    g.fillOval(SCREEN_WIDTH / 3 + 100, SCREEN_HEIGHT / 3 + 100 + (int) headBob, 50, 50); // person in window
    g.setColor(Color.ORANGE.darker().darker().darker());
    g.fillRect(SCREEN_WIDTH / 3 + 100, SCREEN_HEIGHT / 3 + 150, 100, 80);
    g.setColor(Color.BLACK);
    g.drawLine(SCREEN_WIDTH / 3 + 150, SCREEN_HEIGHT / 3 + 400, SCREEN_WIDTH / 3 + 150, SCREEN_HEIGHT / 3 + 250); // door
    g.drawLine(SCREEN_WIDTH / 3 + 250, SCREEN_HEIGHT / 3 + 400, SCREEN_WIDTH / 3 + 250, SCREEN_HEIGHT / 3 + 250);
    g.fillArc(SCREEN_WIDTH / 3 + 150, SCREEN_HEIGHT / 3 + 200, 100, 100, 0, 180);
    g.setColor(Color.ORANGE.darker().darker().darker());
    drawTriangle(g, SCREEN_WIDTH / 3 - 50, SCREEN_HEIGHT / 3, SCREEN_WIDTH / 3 + 550, SCREEN_HEIGHT / 3,
        SCREEN_WIDTH / 2,
        SCREEN_HEIGHT / 4); // roof
    g.setColor(Color.BLACK);
    g.drawLine(SCREEN_WIDTH/3 - 50, SCREEN_HEIGHT/3, SCREEN_WIDTH/3 + 550, SCREEN_HEIGHT /3);
    g.setColor(Color.GREEN);
    g.fillRect(SCREEN_WIDTH / 4, SCREEN_HEIGHT / 4 * 3, 300, 100); // bush
    g.fillRect(SCREEN_WIDTH / 4 * 2, SCREEN_HEIGHT / 4 * 3, 300, 100); // bush
    //g.setColor(Color.ORANGE.darker().darker().darker());
    // g.fillRect(SCREEN_WIDTH/4, SCREEN_HEIGHT, SCREEN_WIDTH, SCREEN_HEIGHT); //
    // tree trunk NOT FINISHED!
    // g.fillOval(SCREEN_HEIGHT, SCREEN_HEIGHT, SCREEN_WIDTH, SCREEN_HEIGHT);// tree
    // leaves NOT FINISHED!
    
    if (mouseX >= SCREEN_WIDTH/3 + 150 && mouseX <= SCREEN_WIDTH/3 + 250 && mouseY >= SCREEN_HEIGHT/3 + 300 && mouseY <= SCREEN_HEIGHT/3 + 450 ) {
      setColor(g, random(255), random(255), random(255));
      g.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
      g.setColor(Color.BLACK);
      fillRect(g, SCREEN_WIDTH/3 + 150, SCREEN_HEIGHT/3 + 250, 100, 150);
    }
    
  }

  public void drawTriangle(Graphics g, int x1, int y1, int x3, int y3, int x2, int y2) {
    int[] xpoints = { x1, x2, x3 };
    int[] ypoints = { y1, y2, y3 };
    g.fillPolygon(xpoints, ypoints, 3);
  }

  public void fillRect(Graphics g, int x, int y, int w, int h) {
    g.fillRect(x, y, w, h);
  }


  public static void main(String[] args) {

    houseProject panel = new houseProject();

    JFrame frame = new JFrame("House Project");
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.setVisible(true);
    // SCREEN_WIDTH = frame.getSize().width;
    //int SCREEN_HEIGHT = frame.getSize().height;

    while (true) {
      panel.repaint();
      dt += 1;
      headBob = Math.sin(dt) * 20;
      //TimeUnit.SECONDS.sleep(1 / 2);
      mouseX = MouseInfo.getPointerInfo().getLocation().getX();
      mouseY = MouseInfo.getPointerInfo().getLocation().getY();
    }
  }
}

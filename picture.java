import java.awt.*;
import java.awt.MouseInfo;

import java.util.Random;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class picture extends JPanel {
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

    BufferedImage HMH = null;
    try{
        HMH = ImageIO.read(new File("hmh.jpg"));
    }
    catch(IOException e) {}
    g.drawImage(HMH, 0, 0, SCREEN_WIDTH, SCREEN_HEIGHT, getBackground(), getFocusCycleRootAncestor());
    setColor(g, 255, 0, 0);
    g.fillRect(0, 0, 200, 200);
    setColor(g, 0, 0, 0);
    g.drawString("Trip", 100, 100);
    if (mouseX < 200 && mouseX > 0 && mouseY < 200 && mouseY > 0) {
        setColor(g, random(255), random(255), random(255));
        g.fillOval(SCREEN_WIDTH/3, SCREEN_HEIGHT/3 + 100, 300, 100);
        g.fillOval(SCREEN_WIDTH/3 + 500, SCREEN_HEIGHT/3 + 100, 300, 100);
    }
    setColor(g, 0, 255, 0);
    g.fillRect(SCREEN_WIDTH - 200, 0, 200, 200);
    setColor(g, 0, 0, 0);
    g.drawString("Don't Trip", SCREEN_WIDTH - 100, 100);
    if (mouseX > SCREEN_WIDTH-200 && mouseX < SCREEN_WIDTH && mouseY < 200 && mouseY > 0) {
        setColor(g, random(255), random(255), random(255));
        g.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
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

    picture panel = new picture();

    JFrame frame = new JFrame("Picture");
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.setVisible(true);

    while (true) {
      panel.repaint();
      dt += 1;
      mouseX = MouseInfo.getPointerInfo().getLocation().getX();
      mouseY = MouseInfo.getPointerInfo().getLocation().getY();
    }
  }
}

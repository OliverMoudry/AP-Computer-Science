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

public class graphingLines extends JPanel {
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



    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int SCREEN_WIDTH = getSize().width;
        int SCREEN_HEIGHT = getSize().height;
        g.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);

        int x = 0;
        int y = 0;

        setColor(g, 12, 45, 232);
        for (x = 0; x <= SCREEN_WIDTH; x += 20) {
            g.drawLine(x, y, x, y + SCREEN_WIDTH);
        }

        x = 0;
        for (y = 0; y <= SCREEN_HEIGHT; y += 20) {
            g.drawLine(x, y, x + SCREEN_WIDTH, y);
        }

        setColor(g, 255, 0, 0);
        for (x = 0; x <= SCREEN_WIDTH; x += 5) {
            y = x*x;
            g.fillOval(x, y, 8, 8);
        }

    }

    public void drawTriangle(Graphics g, int x1, int y1, int x3, int y3, int x2, int y2) {
        int[] xpoints = { x1, x2, x3 };
        int[] ypoints = { y1, y2, y3 };
        g.fillPolygon(xpoints, ypoints, 3);
    }

    public static void main(String[] args) {

        graphingLines panel = new graphingLines();

        JFrame frame = new JFrame("Graph");
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

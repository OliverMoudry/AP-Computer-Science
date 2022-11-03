// Main
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
// Art
import java.awt.*;
import java.awt.event.*;  
import java.awt.geom.Line2D;
import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import javafx.geometry.Dimension2D;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.shape.Polygon;

import java.awt.MouseInfo;
public class mousetest extends JPanel implements MouseListener {  
    static int mouseX;
    static int mouseY;
    static boolean mouseDown = false;
    static boolean mouse3Down = false;

    static void sleep(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
    }

    static int randomInt(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public void setColor(Graphics graphics, int r, int g, int b) {
        Color customColor = new Color(r, g, b);
        graphics.setColor(customColor);
    }

    public int boundColor(int value) {
        int bounded;
        if (value < 0) {
            bounded = 0;
        } else if (value > 255) {
            bounded = 255;
        } else {
            bounded = value;
        }
        return bounded;
    }

    public float bound(float value, float toBound) {
        float bounded;
        if (value < 0) {
            bounded = 0;
        } else if (value > toBound) {
            bounded = toBound;
        } else {
            bounded = value;
        }
        return bounded;
    }

    public int customRound(double n, int r) {
        return (int)(Math.floor(n / r + 0.5) * r);
    }

    public void fillPointByCenter(Graphics g, int x1, int y1, int x2, int y2, String filltype) {
        int finalX1 = x1 - x2/2;
        int finalY1 = y1 - y2/2;

        if (filltype == "oval") {
            g.fillOval(finalX1, finalY1, x2, y2);
        } else if (filltype == "rect") {
            g.fillRect(finalX1, finalY1, x2, y2);
        }
    }

    public int prevX = 0;
    public int prevY = 0;

    public void paintComponent(Graphics graphics) {

        final Graphics2D g = (Graphics2D) graphics.create();

        int SCREEN_WIDTH = getSize().width;
        int SCREEN_HEIGHT = getSize().height;

        
    

        setColor(g, randomInt(255), randomInt(255), randomInt(255));
        if (mouseDown) {
            g.drawLine(prevX, prevY, mouseX, mouseY);
        } else if (mouse3Down) {
            setColor(g, 255, 255, 255);
            g.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
        }
    }

    public void mousePressed(MouseEvent e) { 
        if (e.getButton() == MouseEvent.BUTTON1) {
            mouseDown = true;
        }
    }
    
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            mouseDown = false;
        }
    }


    public void mouse3Pressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3) {
            mouse3Down = true;
        }

    }

    public void mouse3Released(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3) {
            mouse3Down = false;
        }
    }



    public void mouseClicked(MouseEvent e) {}

    public void mouseExited(MouseEvent e) { }  

    public void mouseEntered(MouseEvent e) { } 



    
    public static void main(String[] args) {  
        final mousetest panel = new mousetest();

        final JFrame frame = new JFrame("Art Studio");

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

        frame.addMouseListener(panel);
        while (true) {
            mouseX = (int) MouseInfo.getPointerInfo().getLocation().getX();
            mouseY = (int) MouseInfo.getPointerInfo().getLocation().getY();

            panel.repaint();
        }
    }  
}
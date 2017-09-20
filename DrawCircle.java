import java.awt.*;
import javax.swing.*;

public class DrawCircle extends JFrame {
    int numCircles;

    public DrawCircle()   {
        super("Fun with for Loops" );
        setSize(700, 700);
        setBackground(new Color(51,51,51));
        setLocation(80,80);
        setVisible(true);
    }

    public void paint(Graphics g) {
        drawCircles(g);
    }

    public static void drawCircles(Graphics g) {
        int x, y;
        x = 700/3;
        y = 700/3;
        int r = 300; 
        int amtCircles = r / 30;
        int size = 35;

        for (int i = 0; i < amtCircles; i++) {
            if (i % 2 == 0) {
                g.setColor(new Color(66,134,244));
            } else {
                g.setColor(new Color(255,255,255));
            }
            g.fillOval(x + (i * size)/2, y + (i * size)/2, r - (i * size), r - (i * size));
        }
    }
}
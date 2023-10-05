import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.w3c.dom.css.Rect;

public class Picture extends JPanel {
    private Circle c = new Circle(100, 250, 250, Color.BLUE);
    private Circle sun = new Circle();
    private Square square = new Square();
    private Rectangle grass = new Rectangle();
    private Ellipse cloud = new Ellipse(50, 200, 150, 200, Color.WHITE);


    public void paintComponent(Graphics page) {
        sun.setColor(Color.ORANGE);
        sun.paint(page);
        c.paint(page);
        grass.paint(page);
        square.paint(page);
        cloud.paint(page);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new Picture();
        panel.setPreferredSize(new Dimension(500, 500));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

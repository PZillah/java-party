import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Picture extends JPanel {
    private Circle c = new Circle(100, 250, 250, Color.BLUE, Color.WHITE);
    private Circle sun = new Circle();
    private Square square = new Square();
    private Rectangle ground = new Rectangle(0, 400, 500, 100, Color.GREEN);
    private Rectangle sky = new Rectangle(0, 0, 500, 500, Color.CYAN);
    private Ellipse cloud = new Ellipse(50, 200, 300, 100, Color.WHITE);


    public void paintComponent(Graphics page) {
        sky.paint(page);
        sun.setColor(Color.ORANGE);
        sun.paint(page);
        c.paint(page);
        square.paint(page);
        ground.paint(page);
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

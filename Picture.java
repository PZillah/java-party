import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Picture extends JPanel {
    private Circle c = new Circle(100, 250, 250, Color.BLUE);
    private Circle sun = new Circle();


    public void paintComponent(Graphics page) {
        sun.setColor(Color.ORANGE);
        sun.paint(page);
        c.paint(page);
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

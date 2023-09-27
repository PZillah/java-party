import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorldGUI extends JPanel {
    // Later lines draw on top of what was drawn before
    // Draw back to front
    public void paintComponent(Graphics page) {
        int x = 50;
        int y = 100;
        super.setSize(new Dimension(300, 200));
        page.setFont(new Font("Sans-serif", Font.BOLD, 30));
        // make blue circle
        page.setColor(Color.BLUE);
        page.fillOval(x, y, 236, 76);
        // make yellow circle
        page.setColor(Color.YELLOW);
        page.fillOval(x - 20, y - 45, 230, 70);
        // Draw Hello World shadow to the screen
        page.setColor(Color.BLACK);
        page.drawString("Hello World!", x + 1, y + 1);
        // Draw Hello World to the screen
        page.setColor(Color.RED);
        page.drawString("Hello World!", x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new HelloWorldGUI();
        panel.setPreferredSize(new Dimension(500, 500));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

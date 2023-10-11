import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrainPicture extends JPanel {
    private BoxCarPart bcp = new BoxCarPart(50, 20, 100, 100);
    private BoxCar bc = new BoxCar(5, 50, 400, 75, 75);
    private BoxCar bc2 = new BoxCar(50, 200, 100, 100, Color.BLUE, Color.BLACK);

    public void paintComponent(Graphics page) {
        bc.setColor(Color.BLUE, Color.YELLOW);
        bcp.paint(page);
        bc2.paint(page);
        bc.paint(page);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TrainPicture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new TrainPicture();
        panel.setPreferredSize(new Dimension(500, 500));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

import java.awt.Color;
import java.awt.Graphics;

public class BoxCarPart {
    private Circle wheel;
    private Rectangle carpart;

    public BoxCarPart(int x, int y, int w, int h) {
        carpart = new Rectangle(x, y, w, h, Color.RED);
        wheel = new Circle(w/4, x + w/2, y + h, Color.BLUE);
    }

    public void paint(Graphics page) {
        carpart.paint(page);
        wheel.paint(page);
    }

    public void setWheelColor(Color c) {
        wheel.setColor((c));
    }

    public void setCarColor(Color c) {
        carpart.setColor((c));
    }
}

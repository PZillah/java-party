import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends Circle {
    // FIELD
    private int radius2 = 100;

    public Ellipse(int r, int r2) {
        super(r);         // calls Circle
        radius2 = r2;
    }
    // has no outline color
    public Ellipse(int r1, int r2, int x, int y, Color color) {
        super(r1, x, y, color);
        radius2 = r2;
    }

    public Ellipse(int r1, int r2, int x, int y, Color fillColor, Color outlineColor) {
        super(r1, x, y, fillColor, outlineColor);
        radius2 = r2;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }
    public void paint(Graphics page) {
        page.setColor(super.fillColor);
        page.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
        page.setColor(outlineColor);
        page.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}

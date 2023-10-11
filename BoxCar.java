import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class BoxCar {
    // private int num = 3; this is number of boxcars you want
    private ArrayList<BoxCarPart> bcps = new ArrayList<BoxCarPart>();

    public BoxCar(int n, int x, int y, int w, int h) { // n added to make number of boxcars dynamic
        for (int i = 0; i < n; i++) {
            bcps.add(new BoxCarPart(x + i*w, y, w, h));
        }
        // bcps.add(new BoxCarPart(x, y, w, h));
        // bcps.add(new BoxCarPart(x + w, y, w, h));
        // bcps.add(new BoxCarPart(x + 2 * w, y, w, h));

    }
    public BoxCar(int x, int y, int w, int h) {
        this(3, x, y, w, h);
    }

    public BoxCar(int x, int y, int w, int h, Color bc, Color wc) {
        this(x, y, w, h);
        this.setColor(bc, wc);
    }

    public void paint(Graphics page) {
        for (BoxCarPart bcp : bcps) // don't need curly braces if there is only one line of code.
            bcp.paint(page);
    }

    public void setColor(Color bc, Color wc) {
        for (BoxCarPart bcp : bcps) {
            bcp.setWheelColor(wc);
            bcp.setCarColor(bc);
        }
    }
}

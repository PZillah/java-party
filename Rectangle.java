import java.awt.Color;
import java.awt.Graphics;

public class Rectangle {
    // FIELDS
    private int x, y, width, height;
    private Color color;

    // CONSTRUCTORS
    public Rectangle() {
        x = 100;
        y = 100;
        width = 100;
        height = 200;
        color = Color.CYAN;
    }

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    // METHODS
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void paint(Graphics page) {
        page.setColor(color);
        page.fillRect(x, y, width, height);
        }
        
    // public static void main(String[] args) {
    //     Rectangle r = new Rectangle();
    //     System.out.println("Width is: " + r.getWidth());
    //     r.setWidth(1000);
    //     System.out.println("New width is: " + r.getWidth());
    // }

}

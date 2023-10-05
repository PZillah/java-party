import java.awt.Color;
import java.awt.Graphics;

public class Circle {
    // all fields are kept private
    protected int radius, x, y; // radius is set to 0 by default
    protected Color fillColor = Color.RED;
    protected Color outlineColor = Color.BLACK;

    // optional default constructor
    public Circle() {
        radius = 100;
    }
    // constructor that takes a parameter
    public Circle(int r) {
        radius = r;
    }
    // has no outline color
    public Circle(int radius, int x, int y, Color color) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.fillColor = color;
        this.outlineColor = color;
    }
    public Circle(int radius, int x, int y, Color fillColor, Color outlinColor) {
        this(radius, x, y, fillColor);
        this.outlineColor = outlineColor;
    }
    // to add getter and setter methods: right click in IDE -> Source Action
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setColor(Color color) {
        setFillColor(color);
        setOutlineColor(color);
    }
    public void setFillColor(Color color) {
        this.fillColor = color;
    }
    public void setOutlineColor(Color color) {
        this.outlineColor = color;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    // method
    public String toString() {
        return "Radius is: " + radius;
    }

    public void paint(Graphics page) {
        page.setColor(fillColor);
        page.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
        page.setColor(outlineColor);
        page.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
    
    
    // keep main at the bottom
    public static void main(String[] args) {
        Circle c = new Circle(5); // to create a new object
        System.out.println("initial circle: " + c); 
        c.setRadius(7);
        System.out.println("next circle: " + c);
        Circle c2 = new Circle();
        System.out.println("new circle: " + c2);
    }
}

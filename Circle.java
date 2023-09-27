import java.awt.Color;
import java.awt.Graphics;

public class Circle {
    // all fields are kept private
    private int radius, x, y; // radius is set to 0 by default
    private Color color = Color.RED;


    // optional default constructor
    public Circle() {
        radius = 100;
    }
    // constructor that takes a parameter
    public Circle(int r) {
        radius = r;
    }
    public Circle(int radius, int x, int y, Color color) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.color = color;
    }
    // to add getter and setter methods: right click in IDE -> Source Action
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
        page.setColor(color);
        page.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
    
public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setColor(Color color) {
        this.color = color;
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

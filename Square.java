import java.awt.Color;
import java.awt.Graphics;

public class Square {
    // FIELDS
    private int x, y, width;
    private Color color;

    // CONSTRUCTORS
    // default constructor with no params
    public Square() {
        x = 350; // location on page from the left side on the x axis
        y = 300; // location on page from the top side on the y axis
        width = 100;
        color = Color.PINK;
    }
    // constructor with 4 params (1 for each field)
    public Square(int x, int y, int width, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.color = color;
    }

    // GET AND SET METHODS
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

// Add a getArea() and a getPerimeter() method & test them in main by creating a Square variable & initializing it by calling one of the constructors.
    public int getArea() {
        return width * width;
    }    

    public int getPerimeter() {
        return width * 4;
    }

    public void paint(Graphics page) {
        page.setColor(color);
        page.fillRect(x, y, width, width);
    }

    public static void main(String[] args) {
        Square s = new Square();
        System.out.println("Area is: " + s.getArea());
        System.out.println("Perimeter is: " + s.getPerimeter());
    }
}

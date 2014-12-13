import TurtleGraphics.*;
import java.awt.Color;
public class Triangle extends Shape{

    public Triangle(int x, int y, int size){
        super(x, y, size);
    }
    public String toString() {
        String rs = "This is a triangle.";
        rs += "\nSize = " + this.Size;
        rs += "\nX-Y Position = (" + this.xPos + ", " + this.yPos + ")";
        rs += "\nArea = " + area();
        rs += "\nPerimeter = " + perimeter();
        return rs;
    }

    public double area() {
        return this.Size*this.Size/2;
    }

    public double perimeter() {
        return this.Size*3;
    }
    public void draw(Pen p){
        p.up();
        p.setWidth(2);
        p.setColor(Color.black);
        p.move(this.xPos, this.yPos);
        p.down();
        // Instead of creating 3 points, we'll just exploit turtle graphics'
        // ability to move relative distances along specified angles. Also
        // makes the triangle equilateral.
        p.setDirection(60);
        p.move(this.Size);
        p.setDirection(-60);
        p.move(this.Size);
        p.setDirection(180);
        p.move(this.Size);
        
    }
    
}

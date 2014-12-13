import TurtleGraphics.*;
import java.awt.Color;
public class Square extends Shape{

    public Square(int x, int y, int size){
        super(x, y, size);
    }
    
    public String toString() {
        String rs = "This is a square.";
        rs += "\nSize = " + this.Size;
        rs += "\nX-Y Position = (" + this.xPos + ", " + this.yPos + ")";
        rs += "\nArea = " + area();
        rs += "\nPerimeter = " + perimeter();
        return rs;
    }

    public double area() {
        return this.Size*this.Size;
    }

    public double perimeter() {
        return this.Size*4;
    }
    public void draw(Pen p){
        p.up();
        p.setWidth(2);
        p.setColor(Color.black);
        p.move(this.xPos, this.yPos);
        p.down();
        for (int z=0;z<4;z++){
            p.setDirection(z*90);
            p.move(this.Size);
        }
        
        
    }
    
}

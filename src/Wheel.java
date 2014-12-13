import TurtleGraphics.*;
import java.awt.Color;
public class Wheel extends Circle{

    public Wheel(int x, int y, int radius) {
        super(x, y, radius);
    }
    public String toString(){
        String rs = "This is a wheel.";
        rs += "\nRadius = " + this.Size;
        rs += "\nSpokes = 6";
        rs += "\nX-Y Position = (" + this.xPos + ", " + this.yPos + ")";
        rs += "\nArea = " + area();
        rs += "\nCircumference = " + perimeter();
        return rs;
    }
    public void draw(Pen p){
        super.draw(p);
        p.up();
        p.setColor(Color.black);
        p.setWidth(2);
        p.move(this.xPos, this.yPos);
        p.down();
        for (int z=0;z<6;z++){
            p.setDirection(z*60);
            p.down();
            p.move(this.Size);
            p.up();
            p.move(this.xPos, this.yPos);
        }
    }
    public double area(){
        return super.area();
    }
    public double perimeter(){
        return super.perimeter();
    }
}

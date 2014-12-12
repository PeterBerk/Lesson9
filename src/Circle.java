import TurtleGraphics.*;
import java.awt.Color;
public class Circle extends Shape{
    
    public Circle(int x, int y, int radius){
        super(x, y, radius);
    }
    public String toString() {
        return "";
    }
    public void draw(Pen p){
        double side = 2.0*Math.PI*this.Size/120.0;
        p.up();
        p.setWidth(2);
        p.setColor(Color.black);
        p.move(this.xPos+this.Size, this.yPos-side/2.0);
        p.setDirection(90);
        p.down();
        for (int z=0;z<120;z++){
            p.move(side);
            p.turn(3);
        }
    }

    public double area() {
        return 0;
    }

    public double perimitter() {
        return 0;
    }
    
}

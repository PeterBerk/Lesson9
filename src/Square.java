import TurtleGraphics.*;
import java.awt.Color;
public class Square extends Shape{

    public Square(int x, int y, int size){
        super(x, y, size);
    }
    
    public String toString() {
       return "";
    }

    public double area() {
        return 0;
    }

    public double perimitter() {
        return 0;
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

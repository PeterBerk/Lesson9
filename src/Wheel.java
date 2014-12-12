import TurtleGraphics.*;
import java.awt.Color;
public class Wheel extends Circle{

    public Wheel(int x, int y, int radius) {
        super(x, y, radius);
    }
    public String toString(){
        return "";
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
}

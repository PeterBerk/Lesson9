import TurtleGraphics.*;
abstract public class Shape {
    abstract public String toString();
    abstract public double area();
    abstract public void draw(Pen p);
    abstract public double perimitter();
    protected int xPos, yPos, Size;
    public Shape(int x, int y, int size){
        this.xPos = x;
        this.yPos = y;
        this.Size = size;
    }
}

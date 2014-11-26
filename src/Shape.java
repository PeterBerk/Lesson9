abstract public class Shape {
    abstract public String toString();
    abstract public double area();
    abstract public double perimitter();
    protected int xPos, yPos;
    public Shape(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
}

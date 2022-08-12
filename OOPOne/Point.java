package OOPOne;

import java.lang.Math;

public class Point {
    // write your code here
    private int x;
    private int y;
    
    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public double distance() {
        int x = this.x;
        int y = this.y;
        return Math.sqrt(x*x + y*y);
    }
    
    public double distance(int x, int y) {
        int distanceX = x - this.x;
        int distanceY = y - this.y;
        return Math.sqrt(distanceX*distanceX + distanceY*distanceY);
    }
    
    public double distance(Point point) {
        int distanceX = x - point.getX();
        int distanceY = y - point.getY();
        return Math.sqrt(distanceX*distanceX + distanceY*distanceY);
    }
}

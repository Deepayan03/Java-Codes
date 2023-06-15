import java.lang.Math;
class cylinder
{
    private int radius;
    private int height;
    public int getHeight() {
        height = 10;
        return height;
    }
    public int getRadius() {
        radius=5;
        return radius;
    }

}
public class Radius_and_Area {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        double area = (2* Math.PI * Math.pow(c.getRadius(),2) + (c.getHeight() * (2 * Math.PI*c.getRadius())));
        System.out.println(area);
        
    }
   
}

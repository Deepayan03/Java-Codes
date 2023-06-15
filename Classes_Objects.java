class shapes{
    public void Rectangle(){
        System.out.println("dipu is a rectangle");
    }
    public void Square(){
        System.out.println("dipu is a Square");
    }
    public void Circle(){
        System.out.println("dipu is a Circle");
    }

}
public class Classes_Objects{
    public static void main(String[] args) {
    shapes s=new shapes();
    s.Rectangle();
    s.Square();
    s.Circle();
    }
} 
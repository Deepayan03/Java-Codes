public class Exception1 {
    public static void main(String[] args) {
        int a=155;
        int b=0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("The reason is  ");
            System.out.println(e);
        }
        System.out.println("Program executed successfully");
    }
    
}

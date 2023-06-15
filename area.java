class swap {
    public swap(int a,int b){
    int temp= a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
    }
}

public class area {
    public static void main(String[] args){
        swap s= new swap(18,21);
    }
    
}

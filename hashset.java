import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet();
        h.add(2);
        h.add(5);
        h.add(6);
        h.add(2);
        System.out.println(h);
        Iterator i=h.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    
}

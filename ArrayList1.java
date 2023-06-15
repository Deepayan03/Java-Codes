import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {
    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<Integer>(10);
    list.add(1);
    list.add(2);
    list.add(1,0);
    System.out.println(list);
    list.remove(1);
    System.out.println(list);
    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);
    }
}

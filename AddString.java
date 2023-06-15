public class AddString{
    public static void main(String[] args) {
       String a[]={"[10,20,30]","[80,90,100]"};
       String b=a[0];
       String d=a[1];
       System.out.println(b);
       String c=b.replace("["," ").replace(","," ").replace("]"," ");
       System.out.println(c);
       String e=d.replace("["," ").replace(","," ").replace("]"," ");
        System.out.println(e);
        int [] arr1=new int[e.length()];
        for(int i=0;i<c.length();i++)
        {
            if(b.substring(i)==" ")
            i++;
            arr1[i]=Integer.parseInt(b.substring(i));
        }
        System.out.println(arr1);
    }
    
}

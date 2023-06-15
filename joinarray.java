class joinarray{
    public static Boolean check(String str)
    {
        int a=0;
        int b=0;
        //int checkindex=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            //if(ch[i]==' ')
            //i=i+1;
            if(ch[i]=='a'||ch[i]=='A')
            {
                a=i;
            }
            else if(ch[i]=='b'||ch[i]=='B')
            {
                b=i;
            }
           // System.out.println(ch[i]);
        }
       // System.out.println(a);
        //System.out.println(b);
        if(a-b==3||b-a==3)
        {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String str="I am  boy";
        System.out.println(check(str));
    }
}
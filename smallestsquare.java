class smallestsquare{
    public static int findout(int num)
    {
        int i=0;
        int length=0;
        while(num!=length)
        {
            Integer square=i*i;
            String str=square.toString();
            if(str.length()==6)
            {
                return i;
            }
            length=str.length();
            i++;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(findout(6));      
    }
}
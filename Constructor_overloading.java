class myemployee{
        private int id;
        private String name;
        private int salary;
        public myemployee()
            {
                name="Deepayan Mukhopadhyay";
                id = 132;
                salary=150000;
            }
            public myemployee(String n)
            {
                name=n;
                id = 132;
                salary=150000;
            }
            public myemployee(String n,int i,int s)
            {
                name="Deepayan Mukhopadhyay";
                id = i;
                salary=s;
            }

            public String getname(){
                return name;
            }
            public int getid()
            {
                return id;
            }
            public int getsalary()
            {
                return salary;
            }

}
public class Constructor_overloading {
            public static void main(String[] args) {
            myemployee m = new myemployee("DM",0132,98000);
            System.out.println(m.getname());
            System.out.println(m.getid());
            System.out.println(m.getsalary());
            }
    
}

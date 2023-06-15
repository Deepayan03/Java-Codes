class Employeeinfo
{
    String name;
    int id;
    float salary;
    public float getsalary(String name)
    {
        System.out.println("The salary of "+name+" is "+salary);
        return 0;
    }
    public void namechange()
    {
        name = "Hehe";
    }
}
public class Employee {
    public static void main(String[] args) {
        Employeeinfo e = new Employeeinfo();
        e.name= "Deepayan";
        e.salary=15000;
        e.getsalary("huhu");
        e.namechange();
        System.out.println(e.name);
    }

    
}

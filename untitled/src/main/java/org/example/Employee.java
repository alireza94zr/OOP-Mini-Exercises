public abstract class Employee {


    private String name;

    private int employeeId;

    private double basesalary;

    public Employee(String name, int employeeid, double basesalary) {
        this.name = name;
        this.employeeId = employeeid;
        this.basesalary = basesalary;

    }

    public double getbasesalary() {
        return this.basesalary;
    }


    protected abstract double calculatesalary();

    protected abstract String getrole();

    public void applyraise(double p) {
        this.basesalary = this.basesalary + p;
    }

    protected void showinfo() {
        System.out.println("name =" + this.name + "\nemployee Id =" + this.employeeId + "\nbase salary =" + this.basesalary + "\n");
    }


    public static void main(String[] args) {


        FullTimeEmployee p1 = new FullTimeEmployee("ali", 1, 100.00, 10);
        PartTimeEmployee p2 = new PartTimeEmployee("hossein", 2, 5, 10);
        p1.showinfo();
        p2.showinfo();
        System.out.print(p2.getrole());
        System.out.println(p2.calculatesalary());

        Manager p3 = new Manager("mmd", 3, 6000.00, 2400, 5);
        p3.showinfo();
        System.out.println(p3.calculatesalary());


    }
}

public class FullTimeEmployee extends Employee{
    double bonus;



    public FullTimeEmployee(String name,int employeeid,double basesalary,double bonus)
    {
        super(name, employeeid,basesalary);
        this.bonus = bonus;

    }


    @Override
    public String getrole()
    {
        return "FullTimeEmployee\n";

    }


    @Override
    public double calculatesalary()
    {
        double x = super.getbasesalary();

        return x+this.bonus/12;
    }
}

public class PartTimeEmployee extends Employee {
    private int hoursworked;
    private double hourlyrate;



    public PartTimeEmployee(String name,int employeeid,int hoursworked,double hourlyrate)
    {
        super(name,0,employeeid);
        this.hoursworked = hoursworked;
        this.hourlyrate = hourlyrate;


    }

    @Override
    protected String getrole()
    {
        return "PartTimeEmployee\n";

    }


    @Override
    protected double calculatesalary()
    {
        return this.hourlyrate*this.hoursworked;

    }

}

public class Manager extends FullTimeEmployee{

    private int  teamsize;
    public Manager(String name,int employeeid,double basesalary,double bonus,int teamsize)
    {
        super(name,employeeid,basesalary,bonus);
        this.teamsize = teamsize;
    }

    @Override
    public double calculatesalary()
    {
        return super.getbasesalary() + (super.bonus/12) + (teamsize*100);
    }

    public String getrole()
    {
        return "Manager\n";

    }

}
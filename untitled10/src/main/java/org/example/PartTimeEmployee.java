package org.example;

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

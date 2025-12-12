package org.example;

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
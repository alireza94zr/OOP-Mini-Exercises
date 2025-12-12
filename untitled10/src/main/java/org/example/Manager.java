package org.example;

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
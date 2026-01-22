package Reletionship;
import java.util.*;
public class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    public String toString(){
        return "Name of the Employee:" + this.name + ", "
                + "Department :" + this.department;
    }

}
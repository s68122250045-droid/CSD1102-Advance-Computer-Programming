package Reletionship;
import java.util.*;
public class Employee {
    protected String name;
    protected double salary;
    protected Date birthdate;

    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return this.name;
  }

}
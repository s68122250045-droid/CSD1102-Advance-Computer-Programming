package test;
public class Student {
    private String sid;
    private String name;
    private int age;


    public Student(){} //default Constructor
    public Student (String sid){
        this.sid = sid;
       
    }
    public Student (String sid, String name){
        this.sid = sid;
        this.name = name;
   
    }
      public Student (String sid, String name, int age){
        this.sid = sid;
        this.name = name;
        this.age = age;
       }

    public void setSID(String sid){
        this.sid=sid;
    }
    public String getSID(){
        return this.sid;
    }
    public void printStudent(){
        System.out.println("Print Sudent id" +this.sid);
    }
    public String printStudent(String text){
        System.out.println("Print Sudent Overlading"+text);
        return this.name;
    }
}
package com.company;
import java.util.Random;
import java.util.Scanner;

class MyMainEmployee{
    private int Id,Salary;
     private String name;
     Random random=new Random();
    int x=random.nextInt(50);

    public MyMainEmployee(){
        Id=1;
        Salary=10000;
        name="Something";


    }
    public MyMainEmployee(String n,int s,int i){
        name=n;
        Salary=s;
        Id=i;
    }
    public MyMainEmployee(String n,int s){
        name=n;
        Salary=s;
    }
    public String getName(){
        return name;

    }
    public int getrandom(){
        return x;
    }
    public int getsalary(){
        return Salary;

    }

}
public class constructor_overloading {
    public static void main(String[] args) {
       MyMainEmployee Employee1=new MyMainEmployee("jitu",5000,10);
      //  System.out.println(Employee1.name);
        MyMainEmployee Employee2=new MyMainEmployee("Harry",9000);
        Scanner sc=new Scanner(System.in);
       // System.out.println("enter a number");
        //int num=sc.nextInt();

       // MyMainEmployee Employee=new MyMainEmployee();
       System.out.println(Employee1.getName());
        System.out.println(Employee1.getsalary());
        System.out.println(Employee2.getName());
        System.out.println(Employee2.getsalary());
       // System.out.println(Employee.getrandom());


    }

}


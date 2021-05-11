package com.company;
import java.util.Scanner;
class Employee{
   private int id;
   private String name;
   public void setName(String n){
       name=n;
   }
   public String getName(){
       return name;
   }
   public void setId(int i){
       id=i;
   }
   public int getId(){
       return id;

   }

}
public class access_mod {
    public static void main(String[] args) {
        Employee jitu=new Employee();
        jitu.setId(1);
        jitu.setName("java programming");
        System.out.println(jitu.getName());
        System.out.println(jitu.getId());


    }
}

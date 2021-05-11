package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("CBSE RESULTS");
        System.out.println("enter max marks of one subject: ");
        Scanner sc=new Scanner(System.in);
        float max_marks=sc.nextFloat();
        System.out.println("enter subject1 marks: ");
        float s1=sc.nextFloat();
        System.out.println("enter subject2 marks: ");
        float s2=sc.nextFloat();
        System.out.println("enter subject3 marks: ");
        float s3=sc.nextFloat();
        System.out.println("enter subject4 marks: ");
        float s4=sc.nextFloat();
        System.out.println("enter subject5 marks: ");
        float s5=sc.nextFloat();
        System.out.println();
        float percent=((s1+s2+s3+s4+s5)/(max_marks*5))*100;
        System.out.println("percentage obtained is: ");
        System.out.println(percent+"%");



    }
}

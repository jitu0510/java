package com.company;

import java.util.Scanner;

public class odd_even {
    static String check(int i){
        if(i%2==0){
            return "even";
            //System.out.println("the number "+i+" is even");
        }else
            return "odd";
            //System.out.println("the number "+i+" is odd");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        String ch=check(n);
        System.out.println("the number "+ n +" is "+ch);
    }
}

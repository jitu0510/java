package com.company;

import java.util.Scanner;

public class common_factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gcd=1;
        System.out.println("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=a && i<=b;i++){
            if((a%i==0)&&(b%i==0)){
                System.out.println(i);
            }
        }
       // System.out.println("the gcd is :"+ gcd );

    }
}

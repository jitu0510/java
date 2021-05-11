package com.company;
import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers to find their LCM");
        int x=sc.nextInt();
        int y= sc.nextInt();
        int g=Math.max(x,y);
        int tmp=g;
        int l=Math.min(x,y);
        if(g%l==0){
            System.out.println(g);
        }else{
            for(int i=2;i<10000;i++){
                if(tmp%l==0){
                    System.out.println(tmp);
                    break;
                }tmp=(g*i);
            }

        }
    }
}
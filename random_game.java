package com.company;
import java.util.Scanner;
import java.util.Random;

public class random_game {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Turn for 1st Player");
        int p1,c1=1;
        int p2,c2=1;
        Random random=new Random();
        int rand=random.nextInt(5);
        System.out.println("enter a number");
        p1= sc.nextInt();
        System.out.println(rand);
        while(p1!=rand){
            if(p1>rand){
                System.out.println("enter another number");
                c1++;
            }else if(p1<rand){
                System.out.println("enter another number");c1++;
            }p1=sc.nextInt();
        }
        rand=random.nextInt(5);
        System.out.println(rand);
        System.out.println("Turn for Player2");
        System.out.println("enter a number");
        p2=sc.nextInt();
        while(p2!=rand){
            if(p2>rand){
                System.out.println("enter another number");
                c2++;
            }else if(p2<rand){
                System.out.println("enter another number");c2++;
            }p2=sc.nextInt();
        }
        System.out.println(c1);
        System.out.println(c2);



    }
}

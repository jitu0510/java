package com.company;
import java.util.Scanner;
public class conditional_code {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int[] marks={10,14,11,18,50,12};
      String[] names;
      names=new String[4];
        System.out.println("enter all the names");
        for(int j=0;j<names.length;j++){
            names[j]=sc.next();
        }
      for(int i=marks.length-1;i>=0;i--){
          System.out.println(marks[i]);
      }
        System.out.println(names[0]);


    }
}

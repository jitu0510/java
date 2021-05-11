package com.company;
import java.util.Scanner;

public class telecom {
    public static void main(String[] args) {
       float[] voice={.2f,.2f,.15f,.1f,.15f};
       float[] sms={.1f,.1f,.09f,.11f,.12f};
       float[] data={2.0f,1.99f,2.5f,2.3f,1.9f};
        String[] operator={"ABC","DEF","GHI","JKL","MNO"};
       Scanner sc=new Scanner(System.in);
       float voice_month= sc.nextFloat()*30;
       float sms_month=sc.nextFloat();
       float data_month=sc.nextFloat()/100;
       float[] cost=new float[5];
       int minim=0;
       for(int i=0;i<5;i++){
           cost[i]=voice_month*voice[i]+sms_month*sms[i]+data_month*data[i];
           if(cost[i]<cost[minim]){
               minim=i;
           }
          // System.out.println(cost[i]);
       }
       // System.out.println(cost[minim]);
        System.out.println("Cheapest operator is "+operator[minim]+" and the cost will be "+cost[minim]);
    }

}

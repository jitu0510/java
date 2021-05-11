package com.company;

class base1{
    base1(){
        System.out.println("i am a base class constructor");
    }
    base1(int x){
        System.out.println("value of x is "+x);
    }
}
class childofbase1 extends base1{
    childofbase1(){
        System.out.println("i am child of base1 class constructor");
    }
    childofbase1(int x,int y){
        super(x);
        System.out.println("value of y is "+y);
    }
}
class childofderived extends childofbase1{
    childofderived(){
        System.out.println("i am child of derived class constructor");
    }
    childofderived(int x,int y,int z){
        super(x,y);
        System.out.println("value of z is "+z);
    }
}
public class constructor_inheritance {
    public static void main(String[] args) {
        childofderived c=new childofderived();
           // childofbase1 c1=new childofbase1();
        childofderived d=new childofderived(1,2,3);
    }
}

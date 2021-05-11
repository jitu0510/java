package com.company;
class RHData{
   private float radius;
   private float height;

    public void setradius(float r){
        radius=r;
    }
    public void setheight(float h){
        height=h;
    }
    public float getRadius(){
        return radius;
    }
    public  float getHeight(){
        return height;
    }
    public RHData(float radius,float height){
        this.radius=radius;
        this.height=height;
    }

    public float getvolume(){
        float volume=3.14f*(radius*radius)*height;
        return volume;
    }
}
public class cylinder_volume{
    public static void main(String[] args) {
        RHData RH=new RHData(2.1f,5.2f);
       /* RH.setheight(5.2f);
        RH.setradius(2.1f);*/

        System.out.println(RH.getvolume());

    }
}
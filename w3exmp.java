package com.company;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;


public class w3exmp {
    public static void main(String[] args) {
     ArrayList<Integer> dup=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
     HashSet<Integer> hs=new HashSet<>(dup);
     ArrayList<Integer> ndup=new ArrayList<>(hs);
        //System.out.println(ndup);
        Iterator<Integer> it= ndup.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }

    }
}

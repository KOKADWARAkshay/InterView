package com.company.ArrayList;
import java.util.*;

public class MergeAL {

    public static void main (String args[])
    {
       ArrayList<Integer> list1=new ArrayList<>();
        list1.add(30);
        list1.add(20);
        list1.add(50);
        list1.add(7);
       ArrayList<Integer> list2=new ArrayList<>();
        list2.add(30);
        list2.add(20);
        list2.add(50);
        list2.add(7);

        Merge(list1,list2);

    }
    static void  Merge(ArrayList<Integer> list1, ArrayList<Integer>list2)
    {
        // For adding ArrayList

        //ArrayList1.addAll(ArrayList2);
        list1.addAll(list2);
         System.out.println(list1);



    }
}

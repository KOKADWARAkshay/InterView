package com.company.ArrayList;

import java.util.ArrayList;
import java.util.*;

public class SortList {
    public static void main(String args[]) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(9);
    list.add(4);
    list.add(3);

    // For sorting list
    Collections.sort(list);
    System.out.println(list);

        //Shuffle
        Collections.shuffle(list);
        System.out.println(list);


        ArrayList<String> str=new ArrayList<>();
        str.add("Kokadwar");
        str.add("VIT");
      str.add("Akshay");


    System.out.println(str);

        //Sort
        Collections.sort(str);
        System.out.println(str);

        //Shuffle
        Collections.shuffle(str);
        System.out.print(str);


}
}

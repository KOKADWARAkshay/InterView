package com.company.ArrayList;
import java.util.*;

public class ArrayListSyn {

    public static void main(String args[])
    {
          ArrayList<Integer> list=new ArrayList<>();

          // For adding element in list
          list.add(30);
          list.add(20);
          list.add(50);
          list.add(7);

          //Printing element method
          System.out.println(list);

          // For removing element in list
          list.remove(0);
        System.out.println(list);

          //For getting element from list
        System.out.println(list.get(2));

        // For getting list size
        System.out.println( list.size());

        //For clearing all lement
        list.clear();


//Same operation for string too

    ArrayList<String> str=new ArrayList<>();
    str.add("Akshay");
    str.add("VIT");

    //Printing element method
    System.out.print(str);



    }




}

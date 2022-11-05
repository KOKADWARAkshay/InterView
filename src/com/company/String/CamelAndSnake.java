package com.company.String;

import java.util.Locale;
import java.util.Scanner;

public class CamelAndSnake {
    /*
    Input1 :  AkshayKokadwar
    Output1 :  akshay_kokadwar

    Input2 :CamelCaseToSnakeCase
    Output2: camel_case_to_snake_case
     */


    public static void main(String args[])
    {
        String str1="AkshayKokadwar";


        String str2 = str1.replaceAll("([A-Z]+)([A-Z][a-z])", "$1_$2").replaceAll("([a-z])([A-Z])", "$1_$2");
// Camel to Snake
        System.out.println(str2.toLowerCase());

        //Snake to Camel
        System.out.print(str2.toUpperCase());



    }
}

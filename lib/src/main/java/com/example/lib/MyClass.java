package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();  //身高
        int y=sc.nextInt();  //體重
        int bmi;
        bmi=y/(x*x);
        System.out.println("bmi= " + bmi);


    }
}

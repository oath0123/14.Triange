package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Three Edge Of The Triangle:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if( a+b>c&& a+c>b &&b+c>a)
            System.out.println("Is Triangle");
        else
            System.out.println("Not Triangle");


    }
}

package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�п�J�H�N�T���");
        int a,b,c,N;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        for(int i = 0;i<2;i++){
            if(a>b){
                N=a;
                a=b;
                b=N;
            }
            if (b>c){
                N=b;
                b=c;
                c=N;
            }
        }
        System.out.printf("�Ʀr�Ѥp�ܤj��: %d %d %d",a,b,c);
    }
}

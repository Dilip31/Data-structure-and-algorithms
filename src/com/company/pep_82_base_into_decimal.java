package com.company;
import java.lang.Math;
import java.util.Scanner;

public class pep_82_base_into_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int base=sc.nextInt();
        int  i=0;
        int modulo=0;
        int  [] mark=new int [n];

        while (n>0){

            modulo=modulo+(n%10*( (int) Math.pow(base,i)));
            n=n/10;

            i++;
        }

        System.out.println(modulo);
    }
}

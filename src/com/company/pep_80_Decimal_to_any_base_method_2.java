package com.company;
import java.lang.Math;
import java.util.Scanner;

public class pep_80_Decimal_to_any_base_method_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int base=sc.nextInt();
        int  i=0;
        int modulo=0;
        int  [] mark=new int [n];

        while (n>0){

            modulo=modulo+(n%base*( (int) Math.pow(10,i)));
            n=n/base;

            i++;
        }

        System.out.println(modulo);
    }
}

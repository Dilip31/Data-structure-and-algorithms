package com.company;
import java.lang.Math;
import java.util.Scanner;

public class pep_84_any_base_into_any_base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int base=sc.nextInt();
        int base2=sc.nextInt();
        int  i=0;
        int modulo=0;
        int  [] mark=new int [n];

        while (n>0){

            modulo=modulo+(n%base2*( (int) Math.pow(base,i)));
            n=n/base2;

            i++;
        }

        System.out.println(modulo);
    }
}

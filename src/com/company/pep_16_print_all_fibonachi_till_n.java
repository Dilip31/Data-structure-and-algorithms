package com.company;
import java.util.Scanner;

public class pep_16_print_all_fibonachi_till_n {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("please enter n for fibonachi numbers ");
        int n= sc.nextInt();
        int n1=0;
        int n2=1;
        int n3;
        for (int i=1;i<=n;i++)
        {
            n3=n1+n2;
            System.out.println(n1);
            n1=n2;
            n2=n3;


        }

    }
}

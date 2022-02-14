package com.company;
import java.util.Scanner;

public class pep_22_reverse_a_number {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("please enter n for reverse a number ");
        int n = sc.nextInt();
        int count =0;

        while (n>0)
        {
            int p=n%10;
            System.out.println(p);
            n=n/10;

        }

    }
}

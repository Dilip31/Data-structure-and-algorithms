package com.company;
import java.util.Scanner;

public class pep_18_count_digits_in_a_number {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("please enter number for count its digits ");
        int n= sc.nextInt();
int count=0;
        while (n>0)
        {
         n=n/10;
         count++;
        }
        System.out.println(count);
    }
}

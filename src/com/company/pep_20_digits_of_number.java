package com.company;
import java.util.Scanner;



public class pep_20_digits_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter number for count its digits ");
        int n= sc.nextInt();
        int count=0;
        int temp=n;
        while (temp>0)
        {
            temp=temp/10;
            count++;
        }

        int div=(int)Math.pow(10,count-1);

     while (n>0)
     {
       int digit =n/div;
         System.out.println(digit);
         n=n%div;
         div=div/10;
     }
    }
}

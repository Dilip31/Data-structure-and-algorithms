package com.company;
import java.util.Scanner;

public class pep_30_prime_factorization_method_2 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

        System.out.println("please enter a number for prime factors ");
        int n1= sc.nextInt();

        for (int div=2;div*div <=n1;div++)
        {
            while (n1%div==0)
            {
                n1=n1/div;
                System.out.println(div);
            }
        }
        if (n1!=1)
        {
            System.out.println(n1);
        }
    }
}

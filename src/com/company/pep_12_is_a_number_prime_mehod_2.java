package com.company;
import java.util.Scanner;

public class pep_12_is_a_number_prime_mehod_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter number for check it is prime or not ");
        int n= sc.nextInt();
        int count=0;
        for (int i=2;i*i<=n;i++)
        {
            if (n%i==0)
            {
                count++;
            }

        }
        if (count==0 || n==1)
        {
            System.out.println("entered number is prime number ");
        }
        else {
            System.out.println("entered number is not a prime number ");
        }
    }
}

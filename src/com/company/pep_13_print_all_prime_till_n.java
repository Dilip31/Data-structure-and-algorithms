package com.company;
import java.util.Scanner;

public class pep_13_print_all_prime_till_n {
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);

        System.out.println("please enter low range for prime numbers");
        int low= sc.nextInt();

        System.out.println("please enter high range for prime numbers");
        int high= sc.nextInt();


        for (int i=low;i<=high;i++)
        { int  count=0;
            for (int j=2;j*j<=i;j++)
           {
                if(i%j==0)
                {
                  count++;
                  break;
                }

            }
            if (count == 0 )
            {
                System.out.println(i+" is prime number");
            }

        }
    }
}

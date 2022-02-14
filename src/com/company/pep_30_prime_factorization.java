package com.company;
import java.util.Scanner;


public class pep_30_prime_factorization {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number for prime factors ");
int n1= sc.nextInt();
int n2=2;
int n3;

while (n1>1)
{
    if (n1%n2==0) {
        n3 = n1 / n2;
        n1 = n3;

                System.out.println(n2);

    }else {
        n2++;
    }
}

    }
}

package com.company;
import java.util.Scanner;


public class pep_32_pythagorean_triplet_method_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter a number1  ");
        int n1= sc.nextInt();
        System.out.println("please enter a number2  ");
        int n2= sc.nextInt();
        System.out.println("please enter a number3  ");
        int n3= sc.nextInt();

        int max=n1;

        if (n2>=n1)
        {
            max=n2;
        } if (n3>=n1)
        {
            max=n3;
        }

        if (max==n1)
        {
            boolean value=((n2*n2+n3*n3)==(n1*n1));
            System.out.println(value);
        }else if (max==n2)
        {
            boolean value=((n1*n1+n3*n3)==(n2*n2));
            System.out.println(value);
        }else
        {
            boolean value=((n2*n2+n1*n1)==(n3*n3));
            System.out.println(value);
        }

    }
}

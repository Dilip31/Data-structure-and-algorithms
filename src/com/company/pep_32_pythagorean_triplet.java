package com.company;
import java.util.Scanner;


public class pep_32_pythagorean_triplet {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

        System.out.println("please enter a number1  ");
        int n1= sc.nextInt();
        System.out.println("please enter a number2  ");
        int n2= sc.nextInt();
        System.out.println("please enter a number3  ");
        int n3= sc.nextInt();

        if (n1*n1+n2*n2==n3*n3)
        {
            System.out.println("these numbers are pythagoreaan triplet");

        }

        else if (n2*n2+n3*n3==n1*n1)
        {
            System.out.println("these numbers are pythagoreaan triplet");

        }

        else if (n1*n1+n3*n3==n2*n2)
        {
            System.out.println("these numbers are pythagoreaan triplet");

        }
        else {
            System.out.println("these numbers are not  pythagoreaan triplet");
        }
    }
}

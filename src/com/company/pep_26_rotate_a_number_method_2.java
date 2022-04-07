package com.company;
import java.util.Scanner;

public class pep_26_rotate_a_number_method_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number ");
        int n= sc.nextInt();

        System.out.println("please enter how many times you rotate a number ");
        int r= sc.nextInt();

        int temp1=n;
        int digitsofn=0;
        while (temp1>0)
        {
            temp1=temp1/10;
            digitsofn++;


        }

        r=r%digitsofn;

        if (r<0)
        {
            r=r+digitsofn;
        }

        int div=(int)Math.pow(10,r);
        int multiplier=(int)Math.pow(10,digitsofn-r);

        int qu=n/div;
        int rem=n%div;

        int rotetedno=qu+rem*multiplier;

        System.out.println(rotetedno);
    }
}

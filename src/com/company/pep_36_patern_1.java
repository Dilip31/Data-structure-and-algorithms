package com.company;

import java.util.Scanner;
import java.util.Scanner;
public class pep_36_patern_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }

    }
}

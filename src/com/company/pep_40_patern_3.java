package com.company;

import java.util.Scanner;
import java.util.Scanner;
public class pep_40_patern_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();



        for (int i=n;i>0;i--)
        {
            for (int j=1;j<=n;j++)
            {  if (j<i)
                System.out.print(" \t");
                else {
                System.out.print("*\t");
            }
            }
            System.out.println("");
        }

    }
}

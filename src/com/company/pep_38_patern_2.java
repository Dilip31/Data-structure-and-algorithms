
package com.company;

import java.util.Scanner;
import java.util.Scanner;
public class pep_38_patern_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();

        for (int i=n;i>0;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }

    }
}

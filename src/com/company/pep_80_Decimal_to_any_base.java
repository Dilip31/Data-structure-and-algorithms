package com.company;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class pep_80_Decimal_to_any_base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int base=sc.nextInt();
int i=0;
        int  [] mark=new int [n];

        while (n>0){
            mark[i]=n%base;
n=n/base;

i++;
        }

        for (int j=i-1;j>=0;j--)
        {
            System.out.print(mark[j]);
        }
    }
}

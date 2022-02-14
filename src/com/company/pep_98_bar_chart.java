package com.company;
import java.util.Scanner;


public class pep_98_bar_chart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int []arr=new int[n];

        for (int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }

        int maxno=arr[0];


        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>maxno)
            {
                maxno=arr[i];
            }
        }


        for (int i=maxno;i>0;i--)
        {
            for (int j=0;j<arr.length;j++){
              if (i<=arr[j]){
                  System.out.print("*\t");
              }else {
                  System.out.print(" \t");
              }
            }
            System.out.println();

        }


    }
}

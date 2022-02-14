package com.company;
import java.util.Scanner;


public class pep_94_span_of_array {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

int n= sc.nextInt();

int []arr=new int[n];

for (int i=0;i<arr.length;i++)
{
    arr[i]= sc.nextInt();
}

int maxno=arr[0];
int minno=arr[0];

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>maxno)
            {
                maxno=arr[i];
            }if (arr[i]<minno)
            {
                minno=arr[i];
            }
        }
        System.out.println("span is(maxno-minno) ="+(maxno - minno));




    }
}

package com.company;

import java.util.Scanner;

public class pep_102_Difference_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int[] arr = new int[n1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }



        int [] sum = new int[n2];
        int c = 0;
        int i=arr.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;

        while (k>=0)
        {
            int d=c;
            int alv= i>=0?arr[i]:0;

            arr2[j] =arr2[j] +c;

            if (arr2[j] >=alv )
            {
                d=arr2[j] -alv ;
                c=0;
            }else {
                d=arr2[j] +10-alv +c ;
                c=-1;

            }



//            d=d%10;

            sum[k]=d;

            i--;
            j--;
            k--;
        }
        if(c!=0)
        {
            System.out.println(c);
        }

        for (int val:sum)
        {
            System.out.println(val);
        }
    }
}


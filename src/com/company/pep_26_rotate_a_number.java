package com.company;
import java.util.Scanner;
import java.lang.Math;
 class fornegative{

     public int digit(int n){
         int temp1=n;
         int digitsofn=0;
         while (temp1>0)
         {
             temp1=temp1/10;
             digitsofn++;


         }return digitsofn;
     }
    public int convert(int n,int j){


        n=n+digit(j);
        if (n<0)
        {
            convert(n,j);
        }
        return n;
    }
}

public class pep_26_rotate_a_number {
    public static void main(String[] args) {
fornegative one=new fornegative();

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number ");
        int n= sc.nextInt();

        System.out.println("please enter how many times you rotate a number ");
        int r= sc.nextInt();

if (r<0)
{
    r=one.convert(r,n);
}
        int lastdigits = (int)(n%(Math.pow(10,r)));

        int firstremainingdigits=(int)(n/(Math.pow(10,r)));
int temp=lastdigits;
        int digitsoflastdigits=0;
       while (temp>0)
       {
            temp=temp/10;
           digitsoflastdigits++;

       }

       int rotatedno=firstremainingdigits+(int)(lastdigits*Math.pow(10,one.digit(n)-digitsoflastdigits));

        System.out.println(rotatedno);
    }
}

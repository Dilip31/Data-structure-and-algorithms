package com.company;
import java.util.Scanner;

public class pep_77_Digits_frequency {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int f=sc.nextInt();

        int count=0;

        while (n>0){
            int k=n%10;
            if (k==f){
                count++;
            }
            n=n/10;
        }
        System.out.println(count+"times");
    }
}

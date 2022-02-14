package com.company;
import java.util.Scanner;


public class pep_34_benjamin_bulbs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int k = 1; k*k <= n; k++) {
int p=k*k;
            System.out.println(p);
        }
    }

}

package com.company;
import java.util.Scanner;

public class pep_88_any_base_substraction {
    public static void   main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=1;
        int rv=0;
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int base= sc.nextInt();
        int c=0;

        while (n2>0){

            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;

            int d=0;
            d2=d2+c;

            if (d2>=d1)
            {   c=0;
                d=d2-d1+c;
            }else {
                c=-1;
                d=d2+base-d1;
            }

            rv +=d*p;
            p=p*10;


        }
        System.out.println(rv);
    }
}

package com.company;
import java.util.Scanner;

public class pep_86_any_base_addicion {
    public static void   main(String[] args) {
Scanner sc = new Scanner(System.in);
int p=1;
int rv=0;
int n1= sc.nextInt();
int n2= sc.nextInt();
int base= sc.nextInt();
int c=0;

while (n1>0||n2>0||c>0){

int d1=n1%10;
int d2=n2%10;
n1=n1/10;
n2=n2/10;

int d=d1+d2+c;
c=d/base;
d=d%base;

rv +=d*p;
p=p*10;


}
        System.out.println(rv);
    }
}

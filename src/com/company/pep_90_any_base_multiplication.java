package com.company;
import java.util.Scanner;


public class pep_90_any_base_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int base = sc.nextInt();

        int d=getproduct(n1,n2,base);
        System.out.println(d);

    }
    public static int getproduct(int n1,int n2,int base)
    {
        int rv=0;
        int p = 1;

        while (n2>0){
            int d2=n2%10;
            n2=n2/10;

            int sprd=getproductwithsingledigit(n1,d2,base);

            rv = getsum(rv,sprd*p,base);
            p = p * 10;
        }
        return rv;
    }
    public static int getproductwithsingledigit(int n1, int d2, int base) {
      int rv=0;
        int p = 1;
int c=0;
      while (n1>0||c>0){
          int d1=n1%10;
          n1=n1/10;

          int d=d1*d2+c;

          c=d/base;
          d=d%base;

          rv += d * p;
          p = p * 10;
      }
        return rv;
    }

    public static int getsum(int n1, int n2,int  base) {
        int p = 1;
        int rv = 0;
        int c = 0;

        while (n1 > 0 || n2 > 0 || c > 0) {

            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = d1 + d2 + c;
            c = d / base;
            d = d % base;

            rv += d * p;
            p = p * 10;


        }
        return rv;
    }
}

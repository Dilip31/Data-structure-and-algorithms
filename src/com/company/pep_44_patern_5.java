package com.company;
import java.util.Scanner;

public class pep_44_patern_5 {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int n=sc.nextInt();

  int space=n/2;
  int star=1;

  for (int i=1;i<=n;i++)
  {
          for (int j=1;j<=space;j++)
          {
              System.out.print(" \t");

          }
          for (int k=1;k<=star;k++)
          {
              System.out.print("*\t");

          }

          if (i<=n/2) {
              space--;
              star = star + 2;
          }
          else {
              space++;
              star = star - 2;
      } System.out.println();
  }
    }
}

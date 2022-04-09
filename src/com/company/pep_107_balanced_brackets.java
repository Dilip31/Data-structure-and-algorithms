package com.company;
import java.util.Scanner;
import java.util.Stack;

public class pep_107_balanced_brackets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();


      for (int i=0;i<str.length();i++){

          char ch=str.charAt(i);

          if (ch=='('||ch=='{'||ch=='[')
          {
              st.push(ch);
          }

          else if (ch==')')
          {
boolean val = check(st,'(');
              if (val==false){
                  System.out.println(val);
                  return;
              }
          }

          else if (ch=='}')
          {
              boolean val = check(st,'{');
              if (val==false){
                  System.out.println(val);
                  return;
              }
          }

          else if (ch==']')
          {
              boolean val = check(st,'[');
              if (val==false){
                  System.out.println(val);
                  return;
              }
          }

      }


    }
    public static boolean check(Stack<Character> st,char cha)
    {
        if (st.size()==0)
        {
            return false;

        }
        else if (cha!=st.peek())
        {
            return false;
        }
        else {
            st.pop();
            return true;
        }
    }

}


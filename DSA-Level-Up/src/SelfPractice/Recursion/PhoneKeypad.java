/*
Given a number n and a modern phone keypad. Find out all possible strings generated using that number.
 */
package SelfPractice.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String[] args) {
      ArrayList<String> keypad = new ArrayList<String>() {
          {
              add("");
              add("");
              add("ABC");
              add("DEF");
              add("GHI");
              add("JKL");
              add("MNO");
              add("PQRS");
              add("TUV");
              add("WXYZ");
          }
        };
      Scanner sc = new Scanner(System.in);
      String n = sc.next();
      String output = "";
      keypadOutput(n,output,0);

    }

    private static void keypadOutput(String n, String output, int i) {
        if(n.length()==0){
            System.out.println(output);
            return;
        }


    }
}

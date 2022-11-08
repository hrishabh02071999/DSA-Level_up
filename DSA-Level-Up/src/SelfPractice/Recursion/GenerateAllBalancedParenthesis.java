/*
Generate all balanced parenthesis.
I/P :- An Integer n
O/P :- Balanced parenthesis
Example :- n=2 O/P:- ()() , (())
 */
package SelfPractice.Recursion;

import java.util.Scanner;

public class GenerateAllBalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n ");
        Integer n = sc.nextInt();
        int open = n;
        int close = n;
        String output = "";
        generate(open,close,output);
    }

    private static void generate(int open, int close, String output) {
        if(open==0 && close==0){
            System.out.println(output);
            return;
        }
        if(open!=0){
            String output1 = output;
            output1+="(";
            generate(open-1,close,output1);
        }
        if(close>open){
            String output2 = output;
            output2+=")";
            generate(open,close-1,output2);
        }
    }
}

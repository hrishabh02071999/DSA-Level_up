/*
Print N digit binary number with number of 1s >= 0 in all its prefixes
11010 :- prefixes would be :- 11010, 1101 , 110, 11, 1
 */
package SelfPractice.Recursion;

import java.util.Scanner;

public class NDigitBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        int n = sc.nextInt();
        int one=0;
        int zero = 0;
        String output = "";
        generate(n,one,zero,output);
    }

    private static void generate(int n, int one, int zero, String output) {
        if(n==0){
            System.out.println(output);
            return;
        }
        String output1=output;
        output1+="1";
        generate(n-1,one+1,zero,output1);
        if(one>zero){
            String output2=output;
            output2+="0";
            generate(n-1,one,zero+1,output2);
        }
    }
}

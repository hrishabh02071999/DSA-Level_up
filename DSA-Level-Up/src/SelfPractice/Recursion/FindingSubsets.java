/*
Given a string, find all subsets of given string.       O(2^n)
Input :- abc
Output :- "",a,b,c,ab,ac,bc,abc
 */
package SelfPractice.Recursion;

public class FindingSubsets {
    public static void main(String[] args) {
        String input = "abc";
        String output = "";
        subsets(input,output);
    }

    private static void subsets(String input, String output) {
        //base
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String output1 = output;
        String output2 = output;
        // include
        output1+= input.charAt(0);
        // exclude, do not do anything
        // reduce the size of input
        input  = input.substring(1);
        //recursive call
        subsets(input,output1);
        subsets(input,output2);
    }
}

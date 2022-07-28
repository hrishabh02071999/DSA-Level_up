/*
Print all subsets, print all powersets, print all subsequences

Substring :- Continuous
Subsequence :- Not continuous but same order of occurrence
Subsets :- Not continuous , no order
 */
package Recursion;

public class StringSubsequence {
    public static void main(String[] args) {
        String input = "abc";
        String output = "";
        solve(input,output);
    }

    private static void solve(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String output2 = output;
        output2+=input.charAt(0);
        input = input.substring(1);
        solve(input, output);
        solve(input,output2);
    }
}

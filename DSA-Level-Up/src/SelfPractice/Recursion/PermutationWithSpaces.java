/*
Enter Spaces between string characters.
I/P :- A string :- ABC
O/P :- A_B_C , AB_C , A_BC , ABC
 */

package SelfPractice.Recursion;

public class PermutationWithSpaces {
    public static void main(String[] args) {
        String input = "ABC";
        String output = String.valueOf(input.charAt(0));
        input = input.substring(1);
        solve(input,output);

    }

    private static void solve(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String output1 = output;
        output1 += input.charAt(0);
        String output2 = output;
        output2 += "_";
        output2 += input.charAt(0);
        input = input.substring(1);
        solve(input,output1);
        solve(input,output2);

    }
}

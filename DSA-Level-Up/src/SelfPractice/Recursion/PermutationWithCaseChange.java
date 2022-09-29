/*
Question :- Permutation With Case Change
I/p :- "ab"
O/P :- "ab", "Ab", "aB", "AB"
Choice is to switch case or not.
 */
package SelfPractice.Recursion;

public class PermutationWithCaseChange {
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
        String output1 = output;
        String output2 = output;
        output1 += input.charAt(0);
        output2 += Character.toUpperCase(input.charAt(0));
        input = input.substring(1);
        solve(input,output1);
        solve(input,output2);

    }
}

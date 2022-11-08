/*
Letter case permutation, Includes numbers as well
IP:- a1B2
OP:- a1b2, a1B2, A1b2, A1B2
 */
package SelfPractice.Recursion;

public class LetterCasePermutation {
    public static void main(String[] args) {
        String input = "a1B2";
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
        if(Character.isAlphabetic(input.charAt(0))){
            output1+= Character.toUpperCase(input.charAt(0));
            output2+= Character.toLowerCase(input.charAt(0));
            input=input.substring(1);
            solve(input,output1);
            solve(input,output2);
        }else{
            output1 = output+=input.charAt(0);
            input=input.substring(1);
            solve(input,output1);
        }
    }
}

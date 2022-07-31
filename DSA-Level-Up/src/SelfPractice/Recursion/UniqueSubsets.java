package SelfPractice.Recursion;

public class UniqueSubsets {
    public static void main(String[] args) {
        String input = "aac";
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

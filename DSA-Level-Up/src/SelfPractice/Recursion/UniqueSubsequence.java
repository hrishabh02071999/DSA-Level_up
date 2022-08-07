/*
    For making subsequence unique, we could take help of hashmap.

 */
package SelfPractice.Recursion;

import java.util.HashMap;

public class UniqueSubsequence {
    public static void main(String[] args) {
        String input = "aac";
        String output = "";
        HashMap<String,Integer> map = new HashMap<>();
        solve(input,output,map);
        System.out.println(map);
    }

    private static void solve(String input, String output, HashMap<String, Integer> map) {
        if(input.length()==0){
            if(!map.containsKey(output)){
                map.put(output,1);
            }
            return;
        }
        String output2 = output;
        output2+=input.charAt(0);
        input = input.substring(1);
        solve(input, output, map);
        solve(input,output2, map);
    }
}

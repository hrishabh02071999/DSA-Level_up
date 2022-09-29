/*
    Total number of people 40. Standing in a circle. Counting starts again and one need to kill the 7th person. Counting begins from next person. 24th should survive.
    I/P :- n=40 , k=7
    O/P :- 24
 */
package SelfPractice.Recursion;

import java.util.ArrayList;

public class JosephusProblem {
    public static void main(String[] args) {
        int n=40;
        int k=7;
        k=k-1;
        int index=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(i+1);
        }
        solve(arr,k,index);
    }

    private static void solve(ArrayList<Integer> arr, int k, int index) {
        if(arr.size()==1){
            System.out.println(arr.get(0));
            return;
        }
        index=(index+k)%arr.size();
        arr.remove(index);
        solve(arr,k,index);
    }
}

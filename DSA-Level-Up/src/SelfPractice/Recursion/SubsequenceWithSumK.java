/*
Print all subsequences with Sum K
    arr -> [1,2,1] , k=2
    sol :- [1,1], [2]
 */

package SelfPractice.Recursion;

import java.util.ArrayList;

public class SubsequenceWithSumK {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        int k=2;
        int sum=0;
        int index=0;
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        allSubsequence(index,k,sum,arr,ans,n);
        System.out.println("Just one solution");
        oneSubsequence(index,k,sum,arr,ans,n);
        System.out.println("Count number of subsequences");
        int count= countSubsequence(index,k,sum,arr);
        System.out.println(count);

    }

    private static int countSubsequence(int index, int k, int sum, ArrayList<Integer> arr) {
        if(index==arr.size()){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        sum+=arr.get(index);
        int l = countSubsequence(index + 1, k, sum, arr);
        sum-=arr.get(index);
        int r = countSubsequence(index + 1, k, sum, arr);
        return l+r;
    }

    private static boolean oneSubsequence(int index, int k, int sum, ArrayList<Integer> arr, ArrayList<Integer> ans, int n) {
        if(index==arr.size()){
            if(sum==k){
                System.out.println(ans);
                return true;
            }
            return false;
        }
        ans.add(arr.get(index));
        sum+=arr.get(index);
        if(oneSubsequence(index + 1, k, sum, arr, ans, n)){
            return true;
        }
        sum-=arr.get(index);
        ans.remove(ans.size()-1);
        return oneSubsequence(index + 1, k, sum, arr, ans, n);
    }

    private static void allSubsequence(int index, int k, int sum, ArrayList<Integer> arr, ArrayList<Integer> ans, int n) {
        if(index==arr.size()){
            if(sum==k) System.out.println(ans);
            return;
        }
        ans.add(arr.get(index));
        sum+=arr.get(index);
        allSubsequence(index+1,k,sum,arr,ans,n);
        sum-=arr.get(index);
        ans.remove(ans.size()-1);
        allSubsequence(index+1,k,sum,arr,ans,n);
    }

}

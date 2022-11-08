package SelfPractice.ArraysandVectors;
// Given an array of n integer and a sum S
// find distinct pair that can sum up to target sum , each triplet should be sorted and numbers in triplet also.
// Return a vector of string

// Approach 1:- Brute force , 3 loops O(n^3)
// Approach 2:- Sort array O(nLog(n)) for each number , use two pointer approach for pair sum O(n^2)
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Triplets {

    public static Vector<Vector<Integer>> triplets(Vector<Integer> arr, int targetSum){
        //Logic
        int n = arr.size();
        Collections.sort(arr);
        Vector<Vector<Integer>> result = new Vector<>();

        // Pick every a[i], pair sum for remaining part
        for(int i=0; i<=n-3;i++){

            int j = i + 1;
            int k = n - 1;

            //two pointer approach
            while(j < k){
                int current_sum = arr.get(i);
                current_sum += arr.get(j);
                current_sum += arr.get(k);

                if(current_sum==targetSum){
                    Vector<Integer> vector = new Vector();
                    vector.add(arr.get(i));
                    vector.add(arr.get(j));
                    vector.add(arr.get(k));
                    result.add(vector);
                    j++;
                    k--;
                }
                else if(current_sum > targetSum){
                    k--;
                }
                else{
                    j++;
                }
            }

        }
        return result;

    }
    public static void main(String[] args) {
    	Vector<Integer> arr =new Vector<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,15));
    	int target_Sum=18;
    	System.out.println(triplets(arr,target_Sum));
    }

}

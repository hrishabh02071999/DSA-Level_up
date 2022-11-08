package SelfPractice.Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        Collections.sort(arr);
        ArrayList<Integer> sum = new ArrayList<>();
        int val = 0;
        subsetSum(0,0,arr,sum);
        Collections.sort(sum);
        System.out.println(sum);
    }

    private static void subsetSum(int index, int val, ArrayList<Integer> arr, ArrayList<Integer> sum) {
        if(index==arr.size()){
            sum.add(val);
            return;
        }
        subsetSum(index+1,val+arr.get(index),arr,sum);
        subsetSum(index+1,val,arr,sum);
    }

}

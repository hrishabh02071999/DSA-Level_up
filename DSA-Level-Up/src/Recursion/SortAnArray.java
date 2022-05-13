/*
    Sort an array only using recursion
    First use recursion to make input smaller and sort smaller parts.
    Then use recursion to put the extracted element into right position using recursion.
 */

package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SortAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int l=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter elements");
        for( int i=0;i<l;i++) {
            int temp=sc.nextInt();
            arr.add(temp);
        }
        ArrayList ans = sortAnArray(arr);
        System.out.println("Sorted Array");
        for( int i=0;i<l;i++) {
            System.out.print(ans.get(i) +" ");
        }
    }

    private static ArrayList sortAnArray(ArrayList<Integer> arr) {
        if(arr.size()==1){
            return arr;
        }
        int temp = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        sortAnArray(arr);
        insert(arr,temp);
        return arr;
    }

    private static void insert(ArrayList<Integer> arr, int temp) {
        if(arr.size()==0 || arr.get(arr.size()-1)<=temp){
            arr.add(arr.size(),temp);
            return;
        }
        int val= arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        insert(arr,temp);
        arr.add(arr.size(),val);
    }
}

package SlidingWindow.VariableSize;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestSubarrayOfSumK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int l=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter elements");
        for( int i=0;i<l;i++) {
            int temp=sc.nextInt();
            arr.add(temp);
        }
        System.out.println("Enter Sum k");
        int k=sc.nextInt();
        System.out.println(maxSizeSubarray(l,arr,k));
    }

    private static int maxSizeSubarray(int l, ArrayList<Integer> arr, int k) {
        int i = 0, j = 0, sum = 0, mx = 0;
        while (j < l) {
            sum += arr.get(j);
            if (sum < k) {
                j++;
            }
            if (sum == k) {
                mx = Integer.max(mx, j - i + 1);
                j++;
            }
            if (sum > k) {
                while (sum > k) {
                    sum -= arr.get(i);
                    i++;
                }
                j++;
            }
        }
        return mx;
    }
}

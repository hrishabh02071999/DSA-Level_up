// Given an array of integers. Find maximum sum of subarrays of size k
// Approach 1: - Brute Force :- Two Loops O(n*k)
// Approach 2:- Sliding Window O(n)

package SelfPractice.SlidingWindow.FixedSize;
import java.util.*;
public class MaxSumSubArrayOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int l=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println("Enter elements");
		for( int i=0;i<l;i++) {
			int temp=sc.nextInt();
			arr.add(temp);
		}
		System.out.println("Enter size of subarray");
		int t=sc.nextInt();
		System.out.println(maxSum(l,arr,t));
	}

	private static int maxSum(int l, ArrayList<Integer> arr, int t) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int mx=0;
		int sm=0;
		while(j<l) {
			sm+=arr.get(j);
			if(j-i+1<t) {
				j++;
			}
			else if(j-i+1==t) {
				mx=Math.max(mx, sm);
				sm-=arr.get(i);
				i++;
				j++;
			}
		}
		return mx;
	}

}

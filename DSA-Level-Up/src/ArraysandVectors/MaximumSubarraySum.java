// Given an array of integers. Find subarray having maximum sum.
// Approach 1:- Find all subarray and their sum using 3 loops O(n^3)
// Precompute Cummulative sum and then using two loops find sum O(n^2)
// Kadanes algorithm
package ArraysandVectors;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-1,2,3,4,-2,6,-8,3};
		System.out.println(maxsumsub(arr));
	}

	private static int maxsumsub(int[] arr) {
		// TODO Auto-generated method stub
		int cs=0;
		int ms=0;
		for(int i=0;i<arr.length-1;i++) {
			cs += arr[i];
			if(cs<0) {
				cs=0;
			}
			ms=Math.max(ms,cs);
		}
		return ms;
	}

}

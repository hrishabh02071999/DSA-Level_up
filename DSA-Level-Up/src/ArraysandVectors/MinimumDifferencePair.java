// Given two arrays. Find pair with minimum sum one from each array.
// Approach 1:- Using two loops O(n^2)
// Approach 2:- Sort the array and the run both array. O(nLog(n))
package ArraysandVectors;

import java.util.Arrays;

public class MinimumDifferencePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {23,5,10,17,30};
		int[] arr2= {26,135,134,14,21};
		System.out.println(mindiff(arr1,arr2));
	}

	private static int mindiff(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int a=arr1.length;
		int b=arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int mindiff=Integer.MAX_VALUE;
		int i=0,j=0;
		while(i<a && j<b) {
			int diff=Math.abs(arr1[i]-arr2[j]);
			mindiff=Math.min(mindiff, diff);
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		return mindiff;
	}

}

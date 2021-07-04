// Given an array of integer, return array of integer having product for all numbers except that number.

// Approach 1:- Using two loops. O(n^2)
// Approach 2:- Using prefix and postfix product arrays. O(n)
package ArraysandVectors;

public class ArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		arrproduct(arr);
	}

	private static void arrproduct(int[] arr) {
		// TODO Auto-generated method stub
		int n= arr.length;
		int[] prefix= new int[n];
		int[] postfix= new int[n];
		prefix[0]=1;
		postfix[n-1]=1;
		for(int i=1;i<n;i++) {
			prefix[i]=arr[i-1]*prefix[i-1];
		}
		for(int i=n-2;i>=0;i--) {
			postfix[i]=arr[i+1]*postfix[i+1];
		}
		for(int i=0;i<n;i++) {
			System.out.print(prefix[i]*postfix[i]+" ");
			
		}
	}
}

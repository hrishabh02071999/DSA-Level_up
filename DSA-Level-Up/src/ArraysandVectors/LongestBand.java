// Given an array of integers , find length of longest band
// A band is a subsequence which on being rearranged all elements appear to be consecutive

// Approach 1:- Sort then find all bands. O(nLog(n))
// Approach 2:- Check each element if it is start of a band ,  then traverse to find its length. O(n)

package ArraysandVectors;

import java.util.HashSet;

public class LongestBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,9,3,0,18,5,2,4,10,7,12,6};
		System.out.println(longestBand(arr));
	}

	private static int longestBand(int[] arr) {
		int n=arr.length;
		HashSet<Integer> hash =new HashSet<Integer>();
		for(int i:arr) {
			hash.add(i);
		}
		int largest=1;
		for(int i:arr) {
			int parent= i-1;
			if(hash.contains(parent)==false) {
				int next=i+1;
				int cnt=1;
				while(hash.contains(next)!=false) {
					next++;
					cnt++;
				}
				largest=Math.max(cnt, largest);
			}
		}
		return largest;
	}
	

}

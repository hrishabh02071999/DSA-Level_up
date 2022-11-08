package SelfPractice.ArraysandVectors;
import java.util.HashSet;
import java.util.Vector;

// Given an array of n integer and a sum S
// find distinct pair that can sum up to target sum

// Approach 1:- Brute force using 2 loops O(n^2)
// Approach 2:- Sort(nLog(n)) for each number binary search S-number O(n(Log(n))
// Approach 3:- Use Hashset O(n)
public class pairsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,5,2,3,-6,9,11};
		int target=4;
		Vector<Integer> p =pair(arr,target);
		if(arr.length==0) {
			System.out.println("no such pair");
		}
		else {
			System.out.println(p.get(0)+" "+p.get(1));
		}
	}

	private static Vector<Integer> pair(int[] arr, int target) {
		HashSet<Integer> hash= new HashSet<Integer>();
		Vector<Integer> ans= new Vector<Integer>();
		for(int i=0;i<arr.length;i++) {
			int x=target-arr[i];
			if(hash.contains(x)) {
				ans.add(arr[i]);
				ans.add(x);
				return ans;
			}
			hash.add(arr[i]);
		}
		return ans;
	}

}

// Given an array of +ve and -ve numbers
// Find first negative number in every window of size k
package SlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstNegativeNumberInEveryWindow {
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
		System.out.println("Enter size of subarray");
		int t=sc.nextInt();
		firstNegative(l,arr,t);
	}

	private static void firstNegative(int l, ArrayList<Integer> arr, int t) {
		int i=0;
		int j=0;
		ArrayList<Integer> neg = new ArrayList<>();
		while(j<l) {
			if(arr.get(j)<0) {
				neg.add(arr.get(j));
			}
			if(j-i+1<t) {
				j++;
			}
			else if(j-i+1==t) {
				if(neg.size()==0) {
					System.out.println(0);
				}
				else {
					System.out.println(neg.get(0));
					if(arr.get(i)==neg.get(0)) {
						neg.remove(0);
					}
				}
				j++;
				i++;
			}
		}
	}
}

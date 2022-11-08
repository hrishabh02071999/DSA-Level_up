// Given a string and a pattern string
// Find number of anagrams of pattern in string
package SelfPractice.SlidingWindow.FixedSize;

import java.util.HashMap;
import java.util.Scanner;

public class CountNumberOfAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SelfPractice.String");
		String str = sc.next();
		System.out.println("Enter pattern");
		String ptr = sc.next();
		System.out.println(countAnagrams(str,ptr));
	}

	private static int countAnagrams(String str, String ptr) {
		// TODO Auto-generated method stub
		int ans=0;
		int i=0,j=0;
		int l=ptr.length();
		HashMap<Character,Integer> map = new HashMap<>();
		for(int k=0;k<l;k++) {
			if(map.containsKey(ptr.charAt(k))) {
				map.put(ptr.charAt(k),map.get(ptr.charAt(k))+1);
			}
			else {
				map.put(ptr.charAt(k),1);
			}
		}
		int cnt=map.size();
		while(j<str.length()) {
			map.put(str.charAt(j),map.get(str.charAt(j))-1);
			if(map.get(str.charAt(j))==0) {
				cnt-=1;
			}
			if(j-i+1<l) {
				j++;
			}
			else if(j-i+1==l) {
				if(cnt==0) {
					ans += 1;
				}
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
				if(map.get(str.charAt(i))==1) {
					cnt++;
				}
				i++;
				j++;
			}
		}
		return ans;
	}

}

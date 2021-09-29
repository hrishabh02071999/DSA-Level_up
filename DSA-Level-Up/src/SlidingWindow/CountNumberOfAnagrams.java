package SlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class CountNumberOfAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ptr = sc.next();
		System.out.println(countAnagrams(str,ptr));
	}

	private static int countAnagrams(String str, String ptr) {
		// TODO Auto-generated method stub
		int ans=0;
		int i=0,j=0;
		int l=str.length();
		HashMap<Character,Integer> map = new HashMap<>();
		for(int k=0;k<l;k++) {
			if(map.containsKey(str.charAt(k))) {
				map.put(str.charAt(k),map.get(str.charAt(k))+1);
			}
			else {
				map.put(str.charAt(k),1);
			}
		}
		int cnt=map.size();
		while(j<l) {
			map.put(str.charAt(j),map.get(str.charAt(j))-1);
			if(map.get(str.charAt(j))==0) {
				cnt-=1;
			}
			if(j-i+1<l) {
				j++;
			}
			else if(j-i+1==l) {
				if(cnt==0) {
					ans+=1;
				}
				if(map.get(str.charAt(i))==0) {
					cnt++;
				}
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
				i++;
				j++;
			}
		}
		return ans;
	}

}

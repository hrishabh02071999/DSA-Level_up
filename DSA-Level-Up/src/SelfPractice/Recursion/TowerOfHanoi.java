
/*
    3 poles. 3 discs. move from one to another pole.
    Cond :- pick one disc at a time. No small disc below large disc
    Total time 3^discs -1
 */
package SelfPractice.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of discs");
        int n = sc.nextInt();
        int s=1,h=2,d=3;
        solve(n,s,d,h);
    }

    private static void solve(int n, int s, int d, int h) {
        if(n==1){
            System.out.println("Moving plate "+n+" from "+s+" to "+d);
            return;
        }
        solve(n-1,s,h,d);
        System.out.println("Moving plate "+n+" from "+s+" to "+d);
        solve(n-1,h,d,s);
    }
}

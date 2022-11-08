/*
Given a ladder containing N steps. You can take a jump of 1,2 or 3 at each step. Find the number of ways to climb the ladder.\
Sample:- N=4 Output = 7;            O(n^3)
 */
package SelfPractice.Recursion;

import java.util.Scanner;

public class ClimbingLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
    }

    private static int countWays(int n) {
        //Base
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        // recursive
        return countWays(n-1) + countWays(n-2) + countWays(n-3);
    }

}

/*
    I/p :- n and k, Generate a grammar. if(n==1),(k==1) return 0
    if generate n row, look at n-1 row if 0-> 01 else if 1 -> 10 || Nth row = n-1 row + compliment of n-1 row
    Go on generating grammar recursively till base condition
    Output :- kth element on nth row either 0 or 1.

    Logic:- if k<= mid -> solve(n,k) = solve(n-1,k)
            else -> solve(n,k) = nor(solve(n-1,k-mid))
 */
package Recursion;

import java.util.Scanner;

public class KthSymbolInGrammer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Enter value of k");
        int k = sc.nextInt();
        System.out.println(solve(n,k));

    }

    private static int solve(int n, int k) {
        if(n==1 && k==1){
            return 0;
        }
        int length = (int) Math.pow(2,n-1);
        int mid = length/2;
        if(k<=mid){
            return solve(n-1,k);
        }
        else{
            return solve(n-1,k-mid) == 0 ? 1 : 0;
        }
    }
}

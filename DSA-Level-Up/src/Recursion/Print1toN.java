package Recursion;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n");
        Integer n = sc.nextInt();
        print1toN(n);
    }

    private static void print1toN(int n) {
        if(n>0){
            print1toN(n-1);
            System.out.print(n);
            System.out.print(" ");
        }
    }
}

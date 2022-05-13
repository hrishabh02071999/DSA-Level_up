package Recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n");
        Integer n = sc.nextInt();
        printNto1(n);
    }

    private static void printNto1(Integer n) {
        if(n>0){
            System.out.print(n+" ");
            printNto1(n-1);
        }

    }
}

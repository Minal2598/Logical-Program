package com.program;
public class Fibonacci {

    public static void main(String[] args) {

        int first = 0;
        int second= 1;
        System.out.println("enter a number to find FibonacciSeries:: ");
        int n = Utility.getUserSpecificInteger();
        System.out.println("Fibonacci Series Upto " + n + ": ");

        while (first <= n) {
            System.out.print(first + ", ");

            int Result = first + second;
            first = second;
            second = Result;

        }
    }
}

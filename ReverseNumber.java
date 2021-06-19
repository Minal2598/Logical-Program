package com.program;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number to reverse:");
        int n = Utility.getUserSpecificInteger();
        int  reversed = 0;
        while (n != 0) {

            int digit = n% 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }

}

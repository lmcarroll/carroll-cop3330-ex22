/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        System.out.println("Enter the second number: ");
        input = new Scanner(System.in);
        int b = input.nextInt();

        System.out.println("Enter the third number: ");
        input = new Scanner(System.in);
        int c = input.nextInt();

        if (a == b || a == c || b == c)
            System.exit(0);

        if (a > b) {
            if (a > c) {
                System.out.println("The largest number is " + a + ".");
            } else
                System.out.println("The largest number is " + c + ".");
        } else
            if (b > c) {
                System.out.println("The largest number is " + b + ".");
            } else
                System.out.println("The largest number is " + c + ".");
    }
}

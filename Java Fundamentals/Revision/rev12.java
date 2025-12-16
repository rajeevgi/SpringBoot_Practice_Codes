package Revision;

import java.util.Scanner;

// Find Sum of a digits of a number.
public class rev12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, rem, sum = 0, temp;

        System.out.println("Enter digits: ");
        num = sc.nextInt();

        temp = num;

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("The Sum of " + temp + " is: " + sum);

        sc.close();
    }
}

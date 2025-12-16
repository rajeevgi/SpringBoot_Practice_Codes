package Revision;

import java.util.Scanner;

// Find Reverse of a number.
public class rev10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, rem = 0, rev = 0, temp;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        temp = num;

        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("The Reverse of a number " + temp + " is : " + rev);

        sc.close();
    }
}

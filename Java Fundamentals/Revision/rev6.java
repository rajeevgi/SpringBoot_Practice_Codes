package Revision;

import java.util.Scanner;

// Find Factorial of a number.
public class rev6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, fact = 1;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        for(int i = num; i > 0; i--){
            fact = fact * i;
        }

        System.out.println("The Factorial of a "+ num + " is: " + fact);

        sc.close();
    }
}

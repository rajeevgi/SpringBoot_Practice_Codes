package Revision;

import java.util.Scanner;

// Check Palindrome numbers
public class rev7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num , rem = 0, rev = 0, temp;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        temp = num;

        while(num != 0){
            rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;
        }

        if(temp == rev){
            System.out.println(rev + " is a Palindrome number.");
        }else{
            System.out.println(rev + " is not a Palindrome number.");
        }

        sc.close();
    }
}

package Revision;

import java.util.Scanner;

// Check Armstrong number
public class rev8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, rem, rev = 0, temp;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        temp = num;

        while (num > 0) {
            rem = num % 10;
            rev = rev + (int) Math.pow(rem, 3);
            num = num / 10;
        }

        if(temp == rev){
            System.out.println(rev + " is a armstrong number.");
        }else{
            System.out.println(rev + " is not a armstrong number.");
        }

        sc.close();
    }
}

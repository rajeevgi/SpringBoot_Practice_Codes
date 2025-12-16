package Revision;

import java.util.Scanner;

// Find Sum of a N numbers.
public class rev11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num , sum = 0;

        System.out.println("Enter a digit: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            sum = sum + i;
        }

        System.out.println("The Sum of a number " + num + " is: " + sum);

        sc.close();
    }
}

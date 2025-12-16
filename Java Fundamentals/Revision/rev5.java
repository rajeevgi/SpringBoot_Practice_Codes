package Revision;

import java.util.Scanner;

// Check prime numbers
public class rev5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, count = 0;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        // 1st method
        // for(int i = 1; i <= num; i++){
        //     if(num % i == 0){
        //         count++;
        //     }
        // }

        // if(count == 2){
        //     System.out.println(num + " is a prime number.");
        // }else{
        //     System.out.println(num + " is not a prime number.");
        // }

        // 2nd method
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                count++;
            }
        }

        if(count == 0 && num > 1){
            System.out.println(num + " is a prime number.");
        }else{
            System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }
}

package Revision;

import java.util.Scanner;

// Check which is greater amongst two numbers.
public class rev3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a , b;

        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if(a > b){
            System.out.println(a + " is greater than " + b);
        }else if(b > a){
            System.out.println(b + " is greater than " + a);
        }else if(a == b){
            System.out.println(a + " is equal to " + b);
        }else{
            System.out.println("Invalid numbers...");
        }
        sc.close();
    }
}

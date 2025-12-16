package Revision;

import java.util.Scanner;

// Check which is greater amongst 3 numbers.
public class rev4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Enter three numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " is greater than " + n2 + " & " + n3);
        }else if(n2 > n1 && n2 > n3){
            System.out.println(n2 + " is greater than " + n1 + " & " + n3);
        }else if(n3 > n1 && n3 > n2){
            System.out.println(n3 + " is greater than " + n1 + " & " + n2);
        }else{
            System.out.println("Invalid numbers...");
        }

        sc.close();
    }
}

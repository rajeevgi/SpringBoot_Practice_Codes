package Revision;

import java.util.Scanner;

// Find Fibonacci series
public class rev9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, n1 = 0, n2 = 1, n3;

        System.out.println("Enter a number to which calculate series: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.print("\t" + n1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        sc.close();
    }
}

package Revision.ArraysRevision;

import java.util.Scanner;

// Print Elements of an array
public class arrElementsPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter an elements of an array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Arrays elements are: ");
        for (int i : arr) {
            System.out.print("\t" + i);
        }

        sc.close();
    }
}

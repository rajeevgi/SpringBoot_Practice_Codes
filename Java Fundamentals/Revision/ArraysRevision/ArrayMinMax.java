package Revision.ArraysRevision;

import java.util.Scanner;

// Find  Min and Max Elements from an array.
public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter an array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Elements of an array is: ");
        for (int i : arr) {
            System.out.print("\t" + i);
        }

        int min = arr[0], max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("\nSmallest: " + min);
        System.out.println("Largest: " + max);

        sc.close();
    }
}

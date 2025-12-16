package Revision.ArraysRevision;

import java.util.Scanner;

// Find Sum and Avg of an array elements.
public class ArraySumAndAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Elements are: ");
        for (int i : arr) {
            System.out.print("\t" + i);
        }

        int sum = 0;

        // Calculating Sum and Avg
        for (int i : arr) {
            sum = sum + i;
        }

        double avg = (double) sum / arr.length;

        System.out.println("\nThe sum of array elements are:  " + sum);
        System.out.println("\nThe average of array elements is: " + avg);

        sc.close();
    }
}

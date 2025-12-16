package Revision.ArraysRevision;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];

        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt(); 
        }

        System.out.println("The Elements of an array is: " );
        for (int i : arr1) {
            System.out.print("\t" + i);
        }

        int[] copy = new int[arr1.length];
        // Copying arr1 data to copy array
        for(int i = 0; i < arr1.length; i++){
            copy[i] = arr1[i];
        }

        System.out.println("\nThe Copy array elements are: ");
        for(int i = 0; i < copy.length; i++){
            System.out.print("\t" + copy[i]);
        }

        sc.close();

    }
}

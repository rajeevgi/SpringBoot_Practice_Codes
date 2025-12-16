package Revision.ArraysRevision;

import java.util.Scanner;

// Reverse the array elements.
public class ArrayRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter an elements of an array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Elements of an array is: ");
        for (int i : arr) {
            System.out.print("\t" + i);
        }

        int start = 0, end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("\nThe Reverse Elements of an array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print("\t" + arr[i]);
        }

        sc.close();
    }
}

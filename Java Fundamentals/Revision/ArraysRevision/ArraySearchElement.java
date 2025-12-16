package Revision.ArraysRevision;

import java.util.Scanner;

// Search An Element from an array using Linear Search
public class ArraySearchElement {
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

        System.out.println("\nEnter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                System.out.println(search + " found at index " + (i+1));
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("The Element not found.");
        }

        sc.close();
    }
}

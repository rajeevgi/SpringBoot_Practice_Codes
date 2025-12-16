package Revision;

import java.util.Scanner;

// Find Reverse of a string
public class rev13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String originalStr = null;
        
        System.out.println("Enter a string: ");
        originalStr = sc.nextLine();
        
        // int strLength = originalStr.length();   // For 1st method
        // String reverseStr = "";


        // 1st Method
        // for(int i = strLength - 1; i >= 0; i--){
        //     reverseStr += originalStr.charAt(i);
        // }

        // 2nd Method : Using StringBuilder()
        // StringBuilder sb = new StringBuilder(originalStr);
        // sb.reverse();

        // 3rd Method : Using StringBuffer()
        StringBuffer sb = new StringBuffer(originalStr);
        sb.reverse();

        System.out.println("The Reverse of a string " + originalStr + " is: " + sb);

        sc.close();
    }
}

package Revision;

import java.util.Scanner;

// Check Palindrome String
public class rev14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String originalStr = null;

        System.out.println("Enter a string: ");
        originalStr = sc.nextLine();

        originalStr = originalStr.toLowerCase();
        int strLength = originalStr.length();

        for(int i = 0; i <= strLength / 2; i++){
            if(originalStr.charAt(i) != originalStr.charAt(strLength - i - 1)){
                System.out.println(originalStr + " is not a Palindrome string.");
                return;
            }
        }

        System.out.println(originalStr + " is a Palindrome string.");
        
        sc.close();

    }
}

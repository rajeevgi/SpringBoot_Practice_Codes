package Revision;

import java.util.Scanner;

// Calculator
public class rev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, choice;
        double result = 0;

        do {
            System.out.println("*****************************************");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Modulus");
            System.out.println("6) Exit");
            System.out.println("*****************************************");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter value 1: ");
                a = sc.nextInt();
                System.out.print("Enter value 2: ");
                b = sc.nextInt();

                switch (choice) {
                    case 1:
                        result = a + b;
                        System.out.println("Addition: " + result);
                        break;
                    case 2:
                        result = a - b;
                        System.out.println("Subtraction: " + result);
                        break;
                    case 3:
                        result = a * b;
                        System.out.println("Multiplication: " + result);
                        break;
                    case 4:
                        if (b != 0) {
                            result = (double) a / b;
                            System.out.println("Division: " + result);
                        } else {
                            System.out.println("Error: Division by zero not allowed!");
                        }
                        break;
                    case 5:
                        if (b != 0) {
                            result = a % b;
                            System.out.println("Modulus: " + result);
                        } else {
                            System.out.println("Error: Modulus by zero not allowed!");
                        }
                        break;
                }
            } else if (choice == 6) {
                System.out.println("Exiting the program...");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}

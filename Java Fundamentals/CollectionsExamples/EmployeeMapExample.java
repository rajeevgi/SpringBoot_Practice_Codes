package CollectionsExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMapExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Set The Employees In Map
        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Rajeev - IT");
        employees.put(102, "Aman - Networking");
        employees.put(103, "Aniket - Linux");

        // Fetching Employees by id
        int searchId = 0;

        System.out.println("Enter id to fetch employee: ");
        searchId = sc.nextInt();

        String employee = employees.get(searchId);

        if(employee != null){
            System.out.println("Employee Found: " + employee);
        }else{
            System.out.println("Employee not found with Id: " + searchId);
        }

        sc.close();
    }
}

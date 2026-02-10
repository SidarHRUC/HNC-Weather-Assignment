// Version 1.2 - Code cleaned and checked


/*
 * Weather Analysis Tool
 * calculates average temperature and searches for monthly data.
 */

import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {
        
        // Initialize weather data arrays
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                           "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        int[] temps = {8, 9, 12, 16, 18, 22, 24, 22, 20, 16, 12, 9};

        System.out.println("--- LONDON WEATHER DATA 2023 ---");
        
        // Calculate the average temperature for the year
        double total = 0;
        
        for (int i = 0; i < temps.length; i++) {
            total = total + temps[i];
        }
        
        double average = total / months.length;
        
        System.out.println("Annual Average: " + average + " Celsius");
        
        
        // Search for specific month data based on user input
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- MONTHLY SEARCH ---");
        System.out.print("Enter month to search (e.g. Jan): ");
        
        String search = input.next();
        boolean found = false;
        
        // Iterate through months to find a match
        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(search)) {
                System.out.println("Found: " + months[i] + " was " + temps[i] + "C");
                found = true;
                break; // Stop loop once found
            }
        }
        
        // Handle case where input does not match any month
        if (!found) {
            System.out.println("Error: Month not found.");
        }
    }
}

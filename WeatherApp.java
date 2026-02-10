/*
 * Weather Analysis Program
 * Inputs data for 2 years and calculates averages
 */

import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Arrays to store month names and temperature data
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                           "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        int[] temps2023 = new int[12];
        int[] temps2024 = new int[12];

        System.out.println("--- WEATHER DATA ENTRY ---");
        
        // Loop to get inputs for 2023
        System.out.println("Enter temperatures for 2023:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Temp for " + months[i] + ": ");
            temps2023[i] = input.nextInt();
        }
        
        // Loop to get inputs for 2024
        System.out.println("\nEnter temperatures for 2024:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Temp for " + months[i] + ": ");
            temps2024[i] = input.nextInt();
        }

        // Display all data in a table
        System.out.println("\n--- DATA TABLE ---");
        System.out.println("Month \t 2023 \t 2024");
        System.out.println("---------------------");
        
        for (int i = 0; i < 12; i++) {
            System.out.println(months[i] + " \t " + temps2023[i] + " \t " + temps2024[i]);
        }

        // Calculate annual averages
        double total2023 = 0;
        double total2024 = 0;
        
        for (int i = 0; i < 12; i++) {
            total2023 = total2023 + temps2023[i];
            total2024 = total2024 + temps2024[i];
        }
        
        System.out.println("\n--- AVERAGES ---");
        System.out.println("2023 Average: " + (total2023 / 12));
        System.out.println("2024 Average: " + (total2024 / 12));

        // Search for a specific month
        System.out.println("\n--- SEARCH ---");
        System.out.print("Enter month (e.g. Aug): ");
        String search = input.next();
        boolean found = false;
        
        for (int i = 0; i < 12; i++) {
            // Check if the current month matches the user input
            if (months[i].equalsIgnoreCase(search)) {
                System.out.println("Results for " + months[i] + ":");
                System.out.println("2023: " + temps2023[i]);
                System.out.println("2024: " + temps2024[i]);
                found = true;
                break; // Stop loop after finding the month
            }
        }
        
        if (!found) {
            System.out.println("Month not found.");
        }
    }
}

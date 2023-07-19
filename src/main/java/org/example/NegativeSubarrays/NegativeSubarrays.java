package org.example.NegativeSubarrays;

import java.util.Scanner;

public class NegativeSubarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the number of negative subarrays
        int countNegativeSubarrays = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    countNegativeSubarrays++;
                }
            }
        }

        // Print the result
        System.out.println(countNegativeSubarrays);

        scanner.close();
    }
}

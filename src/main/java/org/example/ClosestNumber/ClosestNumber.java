package org.example.ClosestNumber;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumber {
    public static void main(String[] args) {
        int[] arr = { 15, 12, 788, 1, -1, -778, 2, 0 };
            Scanner scanner =new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
            System.out.println("Girilen Sayı : ");

            int targetNumber = scanner.nextInt();

            int closestSmaller = findClosestSmaller(arr, targetNumber);
            int closestLarger = findClosestLarger(arr, targetNumber);

            System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
        }

        public static int findClosestSmaller(int[] arr, int target) {
            int closest = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num < target && num > closest) {
                    closest = num;
                }
            }
            return closest;
        }

        public static int findClosestLarger(int[] arr, int target) {
            int closest = Integer.MAX_VALUE;
            for (int num : arr) {
                if (num > target && num < closest) {
                    closest = num;
                }
            }
            return closest;
        }
    }

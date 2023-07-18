package org.example.HarmanicAverage;

public class Main {
    public static void main(String[] args) {
        double[] numbers = { 10, 5, 2, 7, 3 };

        double harmonicMean = HarmonicMean.calculateHarmonicMean(numbers);
        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);
    }

    public static class HarmonicMean {
        public static double calculateHarmonicMean(double[] arr) {
            int n = arr.length;
            double harmonicSeries = 0.0;

            // Calculate the harmonic series
            for (int i = 0; i < n; i++) {
                harmonicSeries += 1.0 / arr[i];
            }

            // Calculate the harmonic mean
            return n / harmonicSeries;
        }
    }
}

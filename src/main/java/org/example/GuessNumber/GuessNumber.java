package org.example.GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {


        public static void main(String[] args) {
            Random random = new Random();
            int secretNumber = random.nextInt(101); // 0 ile 100 arasında rastgele bir sayı seçer
            int maxGuessCount = 10;
            int guessCount = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("0 ile 100 arasında bir sayıyı tahmin edin!");

            while (guessCount < maxGuessCount) {
                System.out.print("Tahmininiz: ");
                int userGuess = scanner.nextInt();
                guessCount++;

                if (userGuess == secretNumber) {
                    System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Daha büyük bir sayı girin.");
                } else {
                    System.out.println("Daha küçük bir sayı girin.");
                }

                if (guessCount == maxGuessCount) {
                    System.out.println("Tahmin hakkınız bitti. Doğru sayı: " + secretNumber);
                }
            }


        }
    }



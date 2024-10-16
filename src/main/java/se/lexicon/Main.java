package se.lexicon;

import java.util.Scanner;


public class Main { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CurrencyConverter converter = new CurrencyConverter(); // Create an instance from CurrencyConverter class
    int choice;
    // Menu display to the user with options to convert between difference currencies
    do {
        System.out.println("Currency Converter App:");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("0. Exit");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter amount in SEK: ");
                double sekToUsd = scanner.nextDouble();
                System.out.println("Converted to USD: " + converter.convertSEKtoUSD(sekToUsd));
                break;
            case 2:
                System.out.print("Enter amount in USD: ");
                double usdToSek = scanner.nextDouble();
                System.out.println("Converted to SEK: " + converter.convertUSDtoSEK(usdToSek));
                break;
            case 3:
                System.out.print("Enter amount in SEK: ");
                double sekToEuro = scanner.nextDouble();
                System.out.println("Converted to Euro: " + converter.convertSEKtoEuro(sekToEuro));
                break;
            case 4:
                System.out.print("Enter amount in Euro: ");
                double euroToSek = scanner.nextDouble();
                System.out.println("Converted to SEK: " + converter.convertEuroToSEK(euroToSek));
                break;
            case 0:
                    System.out.println("Exiting...");
                    break;
            default:
                        System.out.println("Invalid choice! Please try again.");
             }
             System.out.println();
         } while (choice != 0);
        scanner.close();
}
}



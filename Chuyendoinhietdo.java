package Chuyen_doi_nhiet_do;

import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice = -1;
        do {
            System.out.println("Menu.");
            System.out.println("1.Fahrenheit to celsius");
            System.out.println("2.Celsius to Fahrenheit");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit :");
                    fahrenheit = input.nextDouble();
                    System.out.println("fahrenheitTOCelsius" + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius :");
                    celsius = input.nextDouble();
                    System.out.println("celsiusToFah" + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);

            }

        } while (choice !=0);


    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius( double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }



}

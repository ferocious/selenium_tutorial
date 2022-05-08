package day1;

import java.util.Scanner;

public class HomeworkDay1 {

//        Napisz metode ktora sprawdza czy podana przez uzytkownika liczba jest liczba pierwsza
//        liczby wpierwsze to takie ktore dziela sie tylko przez 1 oraz sama siebie:
//        2, 3, 5 ,7, 11, 13, .. ..
//        dodatkowo:
//        - uzyj osobnej metody do odczytywania danych od uzytkownika
//        - dodaj obsluge wyjatkow przy odczytywaniu danych
//        - zapetl program - komenda 'exit' powoduje zakonczenie programu

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        checkIsPrimeNUmber(input);
    }

    public static void checkIsPrimeNUmber(int input) {
        int counter = 0;

        if(input <= 1) {
            System.out.println(input + " is not a prime number");
            return;
        } else {
            for(int i = 2; i < input; i++) {
                if(input % i != 0) {
                } else {
                    counter++;
                }
            }
        }

        if(counter > 0) {
            System.out.println(input + " is not a prime number");
        } else {
            System.out.println(input + " is a prime number");
        }
    }
}

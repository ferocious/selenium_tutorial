package day1;

import java.util.Scanner;

public class FruitsExcercise {
    public static void main(String[] args) {
        String fruit;
        int kg;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fruit name: ");
        fruit = scanner.nextLine();

        switch (fruit) {
            case "apple":

            case "banana":

            case "orange":
                System.out.println("Enter kg: ");
                kg = scanner.nextInt();

                System.out.println("Fruit provided is " + fruit);
                    if(kg > 100) {
                        int difference = kg - 100;
                        System.out.println("Too much of " + fruit + ": " + difference + "kg");
                    } else {
                        int difference = 100 - kg;
                        System.out.println("Too less of " + fruit + ": " + difference + "kg");
                    }
                break;

            default:
                System.out.println("Fruit not found");
        }
    }
}

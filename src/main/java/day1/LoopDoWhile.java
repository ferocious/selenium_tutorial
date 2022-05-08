package day1;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) throws InterruptedException {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time: ");
        number = scanner.nextInt();

        do {
            Thread.sleep(500);
            System.out.println("The bomb will explode in " + number + "s...");
            number--;
        } while (number > 0);

        Thread.sleep(500);
        System.out.println("...............EXPLODED!..............");
    }
}
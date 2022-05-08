package day1;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) throws InterruptedException {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = scanner.nextInt();

        for(int i = number; i > 0 ;i--) {
            Thread.sleep(500);
            System.out.println("The bomb will explode in " + number + "s...");
            number--;
        }

        Thread.sleep(500);
        System.out.println("...............EXPLODED!..............");
    }
}

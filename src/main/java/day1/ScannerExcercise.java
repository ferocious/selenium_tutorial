package day1;

import java.util.Scanner;

public class ScannerExcercise {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input a:");
        int a = scanner.nextInt();

        System.out.println("Input b:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b){
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }
    }
}
package day1;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("a + b =" + add(2,5));
        System.out.println("a - b =" + substract(10,2));
        System.out.println("a * b =" + multiply(2,5));
        System.out.println("a / b =" + divide(10,2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

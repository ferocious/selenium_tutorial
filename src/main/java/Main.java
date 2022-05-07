import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
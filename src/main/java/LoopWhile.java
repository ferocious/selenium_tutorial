import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) throws InterruptedException {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = scanner.nextInt();

        while(number > 0){
            Thread.sleep(500);
            System.out.println("The bomb will explode in " + number + "s...");
            number--;
        }

        Thread.sleep(500);
        System.out.println("...............EXPLODED!..............");
    }
}


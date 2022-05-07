import java.util.Scanner;

public class SwitchExcercise {
    public static void main(String[] args) {

        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scanner.nextLine();

        switch (name) {
            case "Dorota":
                     System.out.println("Name provided is " + name);
                     break;

            case "Paweł":
                    System.out.println("Name provided is " + name);
                    break;
            default:
                System.out.println("Name not found");
        }
    }
}

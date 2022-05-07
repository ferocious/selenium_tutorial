import java.util.Scanner;

public class TableExcercise {
    public static void main(String[] args) {

//        Napisz program, w którym zadeklarujesz
//        i utworzysz pięcioelementową tablicę odpowiedniego typu. W pętli pobierzesz
//        od użytkownika 5 imion i je w niej zapiszesz.
//        Następnie wyświetl na ekranie powiadomienia "Witaj imie_z_tablicy"
//        dla każdego z podanych parametrów.

        String[] names = new String[5];
        int i = 0;
        Scanner scanner = new Scanner(System.in);


            for(i = 0; i < names.length; i++) {
                System.out.println("Enter name: ");
                String input = scanner.nextLine();
                names[i] = input;
            }

            for(i = 0;i < names.length; i++) {
                System.out.println("Hello " + names[i]);
            }


//        Utwórz tablicę typu int przechowującą n elementów - gdzie n jest parametrem
//        pobieranym od użytkownika.
//        Następnie wypełnij ją liczbami od 1 do n
//        i wyświetl zawartość na ekranie
//        przy pomocy pętli while.

        System.out.print("Enter number of elements: ");
        int input = scanner.nextInt();
        int[] tab = new int[input];

        for(int j = 0; j < input; j++) {
            tab[j] = j + 1;
            System.out.println(tab[j]);
        }
    }
}

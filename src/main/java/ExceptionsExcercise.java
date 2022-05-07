public class ExceptionsExcercise {
    public static void main(String[] args) {

//        Napisz program, w którym zadeklarujesz i utworzysz pięcioelementową tablicę.
//        Napisz pętlę, która wyjdzie poza długość tablicy.
//        Przechwyć wyjątek ze stosownym komunikatem.

        int[] tab = {1, 2, 3, 4, 5};

        try {
            for(int i = 0; i <= tab.length; i++) {
                System.out.println(tab[i]);
            }
        }
        catch (Exception e) {
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
        }
    }
}

package day2.methodOverloading;

public class Operation {

//    Stwórz klasę Działanie z trzema metodami mnozenie().
//    Metody powinny wyświetlać na konsoli wyniki mnożenia 2,3 lub 4 argumentów.

    public static void multiplicate(int a, int b){
        System.out.println(a*b);
    }

    public static void multiplicate(int a, int b, int c){
        System.out.println(a*b*c);
    }

    public static void multiplicate(int a, int b, int c, int d){
        System.out.println(a*b*c*d);
    }
}
package day3;

import java.util.List;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        MovieLibrary library = new MovieLibrary();

        Director polanski = new Director("Roman", "Polanski");
        Director almodovar = new Director("Pedro", "Almodovar");
        Director allen = new Director("Woody", "Allen");
        Director besson = new Director("Luc", "Besson");

        Actor reno = new Actor("Jean", "Reno");
        Actor deFunes = new Actor("Louis", "De Funes");
        Actor cruz = new Actor("Penelope", "Cruz");
        Actor pitt = new Actor("Brad", "Pitt");
        Actor sandler = new Actor("Adam", "Sandler");
        Actor aniston = new Actor("Jennifer", "Aniston");

        Movie goldenEye = new Movie("Golden eye",1995, allen, Genere.THRILLER);
        goldenEye.addActor(reno);
        goldenEye.addActor(cruz);
        goldenEye.addActor(pitt);

        Movie justGoWithIt = new Movie("Just go with it", 2002, polanski, List.of(aniston, sandler),Genere.COMDEDY);
        Movie lHommeOrchestre = new Movie("L'homme Orchestre", 1949, almodovar, List.of(deFunes, reno), Genere.THRILLER);
        Movie leGandarmeEnBelade = new Movie("Le Gandarme en belade", 1995, besson, List.of(deFunes), Genere.THRILLER);

        library.add(justGoWithIt);
        library.add(lHommeOrchestre);
        library.add(leGandarmeEnBelade);

        Scanner input = new Scanner(System.in);
        boolean isExit = false;
        String inputCommand;

        System.out.println("Komendy: " +
                "\ne - wyjscie\n" +
                "d - szukaj wg dat\n" +
                "r - pokaz losowy film\n" +
                "a - szukaj wg aktora\n");

            while(!isExit) {
            System.out.print("Podaj komende: ");
            inputCommand = input.nextLine();

            switch (inputCommand) {
                case "e":
                    isExit = true;
                    break;
                case "d":
                    System.out.println("Podaj date poczatkowa");
                    int start = Integer.parseInt(input.nextLine());
                    System.out.println("Podaj date koncowa");
                    int end = Integer.parseInt(input.nextLine());
                    library.printMoviesBetweenDates(start, end);
                    break;
                case "r":
                    library.showRandomMovieDetails();
                    break;
                case "a":
                    System.out.println("Podaj imie");
                    String name = input.nextLine();
                    System.out.println("Podaj nazwisko");
                    String lastname = input.nextLine();
                    library.getMoviesByActor(name, lastname);
                    break;
            }
        }
    }
}

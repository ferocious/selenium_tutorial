package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MovieLibrary {
    List<Movie> movieList = new ArrayList<>();

    public void add(Movie movie) {
        movieList.add(movie);
    }

    public List<Movie> getMoviesBetweenDates(int startYear, int endYear) {
        List<Movie> tmp = new ArrayList<>();
        for (Movie item : movieList) {
            if (item.productionYear >= startYear && item.productionYear <= endYear) {
                tmp.add(item);
            }

            // druga wersja filtrowania z uzyciem stream i lambdy
            //tmp = listaFilmow.stream().filter(item -> item.rokWydania >= startYear && item.rokWydania <= endYear).collect(Collectors.toList());
        }
        return tmp;
    }

    public void printMoviesBetweenDates(int startYear, int endYear) {
        for (Movie item : movieList) {
            if (item.productionYear >= startYear && item.productionYear <= endYear) {
                System.out.println(item);
            }
        }
    }

    public void showRandomMovieDetails() {
        int r = ThreadLocalRandom.current().nextInt(0, movieList.size());
        System.out.println(movieList.get(r));
    }

    public List<Movie> getMoviesByActor(String name, String lastName) {
        Actor tmpActor = new Actor(name, lastName);
        List<Movie> tmp = new ArrayList<>();
        for (Movie item : movieList)
            if (item.isActorOnTheList(tmpActor)) {
                tmp.add(item);
            }
        return tmp;
    }

    public void printMoviesWithActor(String name, String lastName){
        for (Movie item : getMoviesByActor(name, lastName)){
            System.out.println(item.title);
        }
    }

}

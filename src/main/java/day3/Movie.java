package day3;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    public int productionYear;
    public String title;
    private Director director;
    private List<Actor> actorList = new ArrayList<>();
    private Genere genere;

    public Movie(String title, int productionYear, Director director, List<Actor> actorList, Genere genere) {
        this.title = title;
        this.productionYear = productionYear;
        this.director = director;
        this.actorList = actorList;
        this.genere = genere;
    }

    public Movie(String title, int productionYear, Director director, Genere genere) {
        this.title = title;
        this.productionYear = productionYear;
        this.director = director;
        this.genere = genere;
    }

    public void addActor(Actor actor) {
        actorList.add(actor);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", productionYear=" + productionYear +
                ", director=" + director +
                ", actorList=" + actorList +
                ", genere=" + genere +
                '}';
    }

    public boolean isActorOnTheList(Actor actor) {
        return actorList.contains(actor);
    }
}

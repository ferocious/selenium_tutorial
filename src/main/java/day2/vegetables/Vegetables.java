package day2.vegetables;

import java.util.ArrayList;
import java.util.List;

public class Vegetables {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Orange orange = new Orange();

        //lista jablek List<Jablko> moze przechowywac tylko elementy typu Jablko
        List<Apple> listaJablek = new ArrayList<>();
        listaJablek.add(apple);

        //List<Owoc> moze przechowywac jablka, pomarancze i banany poniewaz wszystkie dziedzicza po Owoc
        List<Fruit> fruitBasket = new ArrayList<>();
        fruitBasket.add(apple);
        fruitBasket.add(orange);
        fruitBasket.add(banana);

        System.out.println(fruitBasket);

        for(Fruit item : fruitBasket) {
            System.out.println(item.getPrice());
        }
    }
}

package day2.vegetables;

public class Banana extends Fruit {
    public Banana() {
        color = "yellow";
        price = 5;
    }

    @Override
    public String toString() {
        return "The banana is " + color + " and costs " + getPrice() + " pln";
    }
}

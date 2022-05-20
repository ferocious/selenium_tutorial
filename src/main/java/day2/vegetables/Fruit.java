package day2.vegetables;

public abstract class Fruit implements Fruits{
     int price;
     int weight;
     String color;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}

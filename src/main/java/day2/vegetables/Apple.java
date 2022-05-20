package day2.vegetables;

public class Apple extends Fruit{
    public Apple() {
        color = "red";
        price = 3;
    }

    @Override
    public String toString() {
        return "The apple is "+ color + " and costs "+ price +" pln";
    }
}

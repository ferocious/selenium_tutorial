package day2.vegetables;

public class Orange extends Fruit{
    public Orange() {
        color ="pomaranczowy";
        price = 4;
    }

    @Override
    public String toString() {
        return "The orange is "+ color +" and costs "+ price +" pln";
    }
}

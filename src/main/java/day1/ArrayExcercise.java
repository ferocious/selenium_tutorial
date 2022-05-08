package day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayExcercise {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (Integer i = 0; i <= 100; i++ ) {
            if(i % 2 == 0) {
                numbers.add(i * 2);
            } else {
                numbers.add(i);
            }
            System.out.println(numbers.get(i));
        }
    }
}

package day1;

import java.util.ArrayList;
import java.util.List;

public class ForEachExcercise {
    public static void main(String[] args) {
        int k = 100;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= k; i++ ) {
            list.add(i);
        }

        for(int element : list) {
            if(element % 2 == 0) {
                list.set(element, element * 2);
            }
        }

        for(int element: list) {
            System.out.println(element);
        }
   }
}

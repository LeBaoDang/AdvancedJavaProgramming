package javacollection.algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class SortAlgorithm {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(900);
        number.add(212);
        number.add(333);
        System.out.println("Unsorted ArrayList: " + number);

        Collections.sort(number);

        System.out.println("Sorted ArrayList: " + number);
    }
}

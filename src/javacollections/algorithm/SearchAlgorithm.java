package javacollections.algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class SearchAlgorithm {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(100);
        numbers.add(200);

        int position = Collections.binarySearch(numbers,200);
        System.out.println("Position of 300 is " + position);
    }
}

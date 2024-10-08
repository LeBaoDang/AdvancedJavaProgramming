package javacollection.algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleAlgorithm {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("ArrayList" + numbers);

        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle" + numbers);
    }
}

package javacollection.algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class FindTheLargestSmallestElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1000);
        numbers.add(999);
        numbers.add(0);
        System.out.println("Arraylist: " + numbers);

        int min = Collections.min(numbers);
        System.out.println("Mininum " + min);

        int max = Collections.max(numbers);
        System.out.println("Maxinum Element " + max);
    }
}

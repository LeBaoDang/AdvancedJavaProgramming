package javacollections.hashset;

import java.util.HashSet;

public class InHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println(numbers);
    }
}

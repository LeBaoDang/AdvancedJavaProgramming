package javacollections.hashset;

import java.util.HashSet;

public class FindTheSetOfTwoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numberOne = new HashSet<>();
        numberOne.add(2);
        numberOne.add(3);
        numberOne.add(4);

        HashSet<Integer> numberTwo = new HashSet<>();
        numberTwo.add(3);
        numberTwo.add(4);
        numberTwo.add(5);

        numberOne.addAll(numberTwo);

        System.out.println(numberOne);

    }
}

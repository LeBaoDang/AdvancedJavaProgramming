package java.hashset;

import java.util.HashSet;

public class FindCooperationAndDifferenceBetweenTwoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(42);
        HashSet<Integer> primeNumber = new HashSet<>();
        primeNumber.add(2);
        primeNumber.add(3);
        evenNumber.addAll(primeNumber);
        System.out.println(evenNumber);
        evenNumber.removeAll(primeNumber);
        System.out.println(evenNumber);
    }
}

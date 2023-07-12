package javacollection.hashset;

import java.util.HashSet;

public class CheckIfHashSetIsASubfileOfAnotherHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Numbers" + numbers);

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("PrimaNumbers" + primeNumbers);

        boolean result = numbers.containsAll(primeNumbers);
        if (result) {
            System.out.println("S2 là con s1");
        } else {
            System.out.println("S2 không phải là con s1");
        }
    }
}

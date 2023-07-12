package javacollections.algorithm;

import java.util.HashSet;

public class FindTheDifferenceOfTwoHashSet {
    public static void main(String[] args) {
        HashSet<String> name1 = new HashSet<>();
        name1.add("Shakira");
        name1.add("Rihanna");
        name1.add("Taylor");
        HashSet<String> name2 = new HashSet<>();
        name2.add("Rihanna");
        name2.add("Taylor");
        name2.add("Beyonce");
        name1.remove(name2);
        System.out.println(name1);
    }
}

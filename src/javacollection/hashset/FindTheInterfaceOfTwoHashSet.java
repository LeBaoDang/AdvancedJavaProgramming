package javacollection.hashset;

import java.util.HashSet;

public class FindTheInterfaceOfTwoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numberSetOne = new HashSet<>();
        numberSetOne.add(2);
        numberSetOne.add(3);
        numberSetOne.add(4);

        HashSet<Integer> numberSetTow = new HashSet<>();
        numberSetTow.add(3);
        numberSetTow.add(4);
        numberSetTow.add(5);

        numberSetOne.retainAll(numberSetTow);
        System.out.println(numberSetOne);
    }
}

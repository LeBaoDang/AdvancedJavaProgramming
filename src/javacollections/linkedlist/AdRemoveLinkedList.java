package javacollections.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class AdRemoveLinkedList {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        Scanner sr = new Scanner(System.in);

        String name1 = sr.next();
        String name2 = sr.next();
        String name3 = sr.next();

        names.add(name1);
        names.add(name2);
        names.add(0,name3);

        names.remove(2);

        System.out.println(names);
        sr.close();
    }
}

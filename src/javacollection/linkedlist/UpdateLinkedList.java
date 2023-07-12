package javacollection.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class UpdateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Python");

        Scanner sr = new Scanner(System.in);
        String name1 = sr.nextLine();

        languages.set(1,name1);
        System.out.println(languages);

        sr.close();
    }
}

package java.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class AdLinkedList {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        languages.add("java");
        languages.add("python");
        languages.add("nodejs");

        Scanner sr = new Scanner(System.in);
        String languages1 = sr.next();

        languages.add(1,languages1);
        System.out.println(languages);

        sr.close();

    }
}

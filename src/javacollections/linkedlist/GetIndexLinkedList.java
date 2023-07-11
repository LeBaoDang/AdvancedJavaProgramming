package javacollections.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class GetIndexLinkedList {
    public static void main(String[] args) {

        // truy cập phần tử của linkedLink
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Nodejs");

        Scanner sr = new Scanner(System.in);
        int index = sr.nextInt();

        String element = languages.get(index);

        System.out.println(element);

        sr.close();
    }
}

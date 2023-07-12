package javacollection.algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class ExpeditionDataStructureDeque {
    public static void main(String[] args) {
        LinkedList<String> movies = new LinkedList<>();
        Scanner sr = new Scanner(System.in);
        String input1 = sr.nextLine();
        String input2 = sr.nextLine();
        String input3 = sr.nextLine();
        movies.add(input1);
        movies.addFirst(input2);
        movies.addLast(input3);
        System.out.println(movies);
        movies.removeFirst();
        movies.removeLast();
        System.out.println(movies);
        sr.close();
    }
}

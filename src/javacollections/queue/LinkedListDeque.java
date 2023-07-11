package javacollections.queue;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDeque {
    public static void main(String[] args) {
        LinkedList<Character> alphabets = new LinkedList<>();
        alphabets.add('A');
        Scanner sr = new Scanner(System.in);
        char char1 = sr.nextLine().charAt(0);
        char char2 = sr.nextLine().charAt(0);

        alphabets.addFirst(char1);
        alphabets.addLast(char2);

        // removeFirst
        // removeLast

        System.out.println(alphabets);
        sr.close();
    }
}

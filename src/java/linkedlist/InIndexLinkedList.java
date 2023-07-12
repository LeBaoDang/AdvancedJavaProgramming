package java.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class InIndexLinkedList {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        Scanner sr = new Scanner(System.in);
        String names1 = sr.nextLine();
        String names2 = sr.nextLine();
        String names3 = sr.nextLine();

        names.add(names1);
        names.add(names2);
        names.add(names3);

        for (String s : names){
            System.out.println(s);
        }

        sr.close();

    }

}

package javacollection.algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class AccessingAnElementOfALinkedList {
    public static void main(String[] args) {
        LinkedList<String> series = new LinkedList<>();
        String input1, input2, input3;
        Scanner sr = new Scanner(System.in);
        input1 = sr.nextLine();
        input2 = sr.nextLine();
        input3 = sr.nextLine();
        series.add(input1);
        series.add(input2);
        series.add(input3);
        System.out.println(series);
        String a = series.get(2);
        System.out.println(a);
        sr.close();
    }
}

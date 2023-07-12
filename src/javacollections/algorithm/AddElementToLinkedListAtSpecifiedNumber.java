package javacollections.algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class AddElementToLinkedListAtSpecifiedNumber {
    public static void main(String[] args) {
        LinkedList<String> menu = new LinkedList<>();
        Scanner sr = new Scanner(System.in);
        String input1 = sr.nextLine();
        String input2 = sr.nextLine();
        String input3 = sr.nextLine();
        menu.add(input1);
        menu.add(input2);
        menu.add(input3);
        System.out.println(menu);
        menu.add(1,"Pizaa");
        System.out.println(menu);
        sr.close();
    }
}

package javacollection.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        String name1 = sr.nextLine();
        String name2 = sr.nextLine();
        String name3 = sr.nextLine();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        Collections.sort(names);
        System.out.println(names);
        sr.close();
    }
}

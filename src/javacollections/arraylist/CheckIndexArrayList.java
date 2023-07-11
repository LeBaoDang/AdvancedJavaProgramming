package javacollections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckIndexArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Dang");
        names.add("Hoa");
        names.add("Hung");

        Scanner sr = new Scanner(System.in);
        String text = sr.next();
        boolean result = names.contains(text);

        System.out.println(result);

        sr.close();
    }
}

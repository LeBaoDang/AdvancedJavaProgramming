package javacollections.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        String input1 = sr.nextLine();
        String input2 = sr.nextLine();
        String input3 = sr.nextLine();
        languages.add(input1);
        languages.add(input2);
        languages.add(input3);
        System.out.println(languages);
        languages.remove(1);
        System.out.println(languages);
        sr.close();
    }
}

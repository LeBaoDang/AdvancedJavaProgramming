package java.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FillsTheElementsWithTheSpecifiedValue {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        String text1 = sr.nextLine();
        String text2 = sr.nextLine();
        String text3 = sr.nextLine();

        languages.add(text1);
        languages.add(text2);
        languages.add(text3);

        Collections.fill(languages,"random");
        System.out.println(languages);
        sr.close();
    }
}

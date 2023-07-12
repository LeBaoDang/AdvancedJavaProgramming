package java.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortPlayersAgesInAscendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int input1 = sr.nextInt();
        int input2 = sr.nextInt();
        int input3 = sr.nextInt();
        age.add(input1);
        age.add(input2);
        age.add(input3);
        System.out.println(age);
        Collections.sort(age);
        System.out.println(age);
        sr.close();
    }
}

package java.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangeTheElementOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int num1 = sr.nextInt();
        int num2 = sr.nextInt();
        int num3 = sr.nextInt();
        marks.add(num1);
        marks.add(num2);
        marks.add(num3);
        System.out.println(marks);
        marks.set(1,86);
        System.out.println(marks);
        sr.close();
    }
}

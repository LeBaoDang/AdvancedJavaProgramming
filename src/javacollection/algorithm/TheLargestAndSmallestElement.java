package javacollection.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TheLargestAndSmallestElement {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int num1 = sr.nextInt();
        int num2 = sr.nextInt();
        int num3 = sr.nextInt();
        numberList.add(num1);
        numberList.add(num2);
        numberList.add(num3);
        // phần tử nhỏ nhất
        int min = Collections.min(numberList);
        System.out.println(min);
        // phần tử lớn nhất
        int max = Collections.max(numberList);
        System.out.println(max);
        sr.close();
    }
}

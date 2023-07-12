package javacollections.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapThePositionsOfTwoElements {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int num1 = sr.nextInt();
        int num2 = sr.nextInt();
        int num3 = sr.nextInt();
        numberList.add(num1);
        numberList.add(num2);
        numberList.add(num3);
        Collections.swap(numberList, 0, 2);
        System.out.println(numberList);
        sr.close();
    }
}

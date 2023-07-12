package javacollection.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchAnSectionInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(12);
        numberList.add(34);
        numberList.add(67);
        numberList.add(100);
        Scanner sr = new Scanner(System.in);
        int element = sr.nextInt();

        int pos = Collections.binarySearch(numberList,element);

        System.out.println(pos);

    }
}

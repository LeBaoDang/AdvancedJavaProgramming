package javacollection.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CopyACollectionToAnotherCollection {
    public static void main(String[] args) {
        ArrayList<Integer> src = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int num1 = sr.nextInt();
        int num2 = sr.nextInt();
        src.add(num1);
        src.add(num2);
        ArrayList<Integer> dest = new ArrayList<>();
        dest.add(22);
        dest.add(23);
        Collections.copy(dest,src);
        System.out.println(dest);
        sr.close();
    }
}

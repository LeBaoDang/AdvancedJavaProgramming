package javacollection.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LookingForNemo {
    public static void main(String[] args) {
        ArrayList<String> fish = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        String input1 = sr.nextLine();
        String input2 = sr.nextLine();
        String input3 = sr.nextLine();
        fish.add(input1);
        fish.add(input2);
        fish.add(input3);
        int pos = Collections.binarySearch(fish,"nemo");
        if(pos >= 0 ){
            System.out.println(pos);
        } else {
            System.out.println("not found");
        }
        sr.close();
    }
}

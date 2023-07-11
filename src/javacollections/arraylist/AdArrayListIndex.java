package javacollections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AdArrayListIndex {
    public static void main(String[] args) {
        // thêm phần tử ArrayList bằng chỉ số index

        ArrayList<String> names = new ArrayList<>();

        names.add("Dang");
        names.add("Hung");

        Scanner inputIndex = new Scanner(System.in);
        String name3 = inputIndex.next();

        names.add(1,name3);

        System.out.println(names);

        inputIndex.close();

    }
}

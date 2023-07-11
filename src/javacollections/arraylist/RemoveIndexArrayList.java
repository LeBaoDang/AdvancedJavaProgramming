package javacollections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveIndexArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Dang");
        names.add("Hung");
        names.add("Hoa");

        Scanner input = new Scanner(System.in);
        int index = input.nextInt();

        names.remove(index);

        System.out.println(names);

        input.close();

    }
}

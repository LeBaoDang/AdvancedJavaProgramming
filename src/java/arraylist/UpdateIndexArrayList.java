package java.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateIndexArrayList {
    public static void main(String[] args) {

        //Viết chương trình thay đổi các phần tử của ArrayList.

        ArrayList<String> names = new ArrayList<>();

        names.add("Dang");
        names.add("Hung");
        names.add("Hoa");

        Scanner input = new Scanner(System.in);
        String element = input.next();

        names.set(1,element);

        System.out.println(names);
        input.close();

    }
}

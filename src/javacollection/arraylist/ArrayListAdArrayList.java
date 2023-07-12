package javacollection.arraylist;

import java.util.ArrayList;

public class ArrayListAdArrayList {
    public static void main(String[] args) {
        //Tạo một ArrayList từ ArrayList khác
        ArrayList<String> names = new ArrayList<>();
        names.add("Dang");
        names.add("Hung");
        names.add("Hoa");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Vinh");

        names2.addAll(names);

        System.out.println(names);
        System.out.println(names2);
    }
}

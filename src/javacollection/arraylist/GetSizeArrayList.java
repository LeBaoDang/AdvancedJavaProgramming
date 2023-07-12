package javacollection.arraylist;

import java.util.ArrayList;

public class GetSizeArrayList {
    public static void main(String[] args) {
        // in ra kích thước của mảng
        ArrayList<String> names = new ArrayList<>();
        names.add("Dang");
        names.add("Hoa");
        names.add("Hung");
        int size = names.size();
        System.out.println(names);
        System.out.println("size names = " + size);
    }
}

package javacollections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class GetIndexArrayList {
    public static void main(String[] args) {
        //Viết chương trình truy cập một phần tử của ArrayList.

        ArrayList<String> names = new ArrayList<>();

        names.add("Dang");
        names.add("Hung");
        names.add("Hoa");

        Scanner input = new Scanner(System.in);
        //chỉ số index
        int index = input.nextInt();
        // chuôi muốn chèn
        String name1 = input.next();

        String element = names.get(index);

        names.add(1,name1);

        System.out.println(element);
        System.out.println(names);

        input.close();

    }
}

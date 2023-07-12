package java.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AdArrayList {

    public static void main(String[] args) {
        // Thêm phần tử vào ArrayList

        ArrayList<String> names = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String name1 = input.next();
        String name2 = input.next();

        names.add(name1);
        names.add(name2);

        System.out.println(names);

        input.close();

    }

}

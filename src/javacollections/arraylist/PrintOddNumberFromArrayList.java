package javacollections.arraylist;

import java.util.ArrayList;

public class PrintOddNumberFromArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(100);
        number.add(102);
        number.add(111);

        for (int i = 0; i < number.size(); i++) {
            if ( number.get(i) % 2 != 0 ) {
                System.out.println(number.get(i));
            }
        }

    }

}

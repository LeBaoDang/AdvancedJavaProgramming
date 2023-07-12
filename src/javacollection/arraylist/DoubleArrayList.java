package javacollection.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleArrayList {
    public static void main(String[] args) {
        // tạo ArrayList từ Double
        ArrayList<Double> number = new ArrayList<>();

        Scanner sr = new Scanner(System.in);
        Double n1 = sr.nextDouble();
        Double n2 = sr.nextDouble();
        Double n3 = sr.nextDouble();

        number.add(n1);
        number.add(n2);
        number.add(n3);

        for(Double d : number){
            System.out.println(d);
        }

        sr.close();

    }
}

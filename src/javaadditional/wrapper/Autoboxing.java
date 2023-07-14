package javaadditional.wrapper;

import java.util.Scanner;

public class Autoboxing {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        double number = sr.nextDouble();
        Double xObj = number;
        System.out.println(xObj);
        sr.close();
    }
}

package javaadditional.lambda;

import java.util.Scanner;

public class MainParamester {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        SubtractionParamester obj = (x,y) -> System.out.println(x-y);
        obj.subtrac(a,b);
        sr.close();
    }
}

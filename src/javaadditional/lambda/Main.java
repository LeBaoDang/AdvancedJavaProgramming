package javaadditional.lambda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int number1 = sr.nextInt();
        int number2 = sr.nextInt();
        Subtraction obj = () -> System.out.println(number1 - number2);
        obj.subtract();
        sr.close();
    }
}

package javaadditional.generics;

import java.util.Scanner;

class Generics<T> {
    public Generics(T data) {
        System.out.println(data);
    }
}
class main {
    public static void main(String[] args) {
        // take input from the user
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        Generics<Double> doubleObj = new Generics<>(number);
        input.close();
    }
}
